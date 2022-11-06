
package Services;

//import edu.upc.dsa.models.Product;
import Manager.ProductManager;
import Manager.ProductManagerImpl;
import Clases.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import javax.ws.rs.*;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Api(value = "/product", description = "Endpoint to Product Service")
@Path("/product")

public class ProductService {
    private ProductManager tm;

    public ProductService() {
        this.tm = ProductManagerImpl.getInstance();
        if (tm.size()==0) {
            this.tm.addProduct("B001", "Coca cola", 2);
            this.tm.addProduct("C002", "Café amb gel", 1.5);
            this.tm.addProduct("A002", "Donut", 2.25);
            this.tm.addProduct("A003", "Croissant", 1.25);
        }
    }

    @GET
    @ApiOperation(value = "get all Product", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Product.class, responseContainer="List"),
    })
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProducts() {

        List<Product> Products = this.tm.findAll();

        GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(Products) {};
        return Response.status(201).entity(entity).build()  ;
    }

    @GET
    @ApiOperation(value = "get all Product ordered by price", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Product.class, responseContainer="List")
    })
    @Path("/price")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductByPrice() {
        List<Product> Products = this.tm.productsByPrice();
        GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(Products) {
        };
        return Response.status(201).entity(entity).build();
    }

    @GET
    @ApiOperation(value = "get all Product ordered by sales", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Product.class, responseContainer="List")
    })
    @Path("/sales")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProductBySales() {
        List<Product> Products = this.tm.productsBySales();
        GenericEntity<List<Product>> entity = new GenericEntity<List<Product>>(Products) {};
        return Response.status(201).entity(entity).build();
    }

    @GET
    @ApiOperation(value = "get all processedOrders by an user", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful", response = Order.class, responseContainer="List"),
            @ApiResponse(code = 404, message = "Product not found or no processed orders yet")
    })
    @Path("/order/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getOrdersByUsers(@PathParam("id") String id) {
        List<Order> Orders = this.tm.ordersByUser(id);
        if (Orders == null) return Response.status(404).build();
        GenericEntity<List<Order>> entity = new GenericEntity<List<Order>>(Orders) {};
        return Response.status(201).entity(entity).build();
    }
    /*
    @DELETE
    @ApiOperation(value = "delete a Product", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    @Path("/{id}")
    public Response deleteProduct(@PathParam("id") String id) {
        Product t = this.tm.getProduct(id);
        if (t == null) return Response.status(404).build();
        else this.tm.deleteProduct(id);
        return Response.status(201).build();
    }
    */
    @PUT
    @ApiOperation(value = "process an Order", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 404, message = "Product not found")
    })
    @Path("/processOrder")
    public Response processOrder() {

        Order t = this.tm.processOrder();

        if (t == null) return Response.status(404).build();

        return Response.status(201).build();
    }



    @POST
    @ApiOperation(value = "create a new order from user X", notes = "asdasd")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Successful"),
            @ApiResponse(code = 500, message = "Validation Error")

    })

    @Path("/order")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response newOrder(Order order) {
        if (order.getUserId()==null || order.getElements()==null)  return Response.status(500).build();
        this.tm.addOrder(order);
        return Response.status(201).build();
    }
}

