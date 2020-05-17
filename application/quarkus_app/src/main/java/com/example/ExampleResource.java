package com.example;

import org.example.controller.UserController;
import org.example.controller.model.UserWeb;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
public class ExampleResource {

    private final UserController controller;

    @Inject
    public ExampleResource(final UserController controller) {
        this.controller = controller;
    }

    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "hello";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public UserWeb createUser(final UserWeb userWeb) {
        return controller.createUser(userWeb);
    }

    @GET
    @Path("/login")
    public UserWeb login(@QueryParam("email") final String email, @QueryParam("password") final String password) {
       return controller.login(email, password);
    }

    @GET
    @Path("{userId}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public UserWeb getUser(@PathParam("userId") final String userId) {
        return controller.getUser(userId);
    }

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<UserWeb> allUsers() {
        return controller.allUsers();
    }

}