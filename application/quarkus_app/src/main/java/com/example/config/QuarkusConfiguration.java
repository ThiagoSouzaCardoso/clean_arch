package com.example.config;

import org.example.config.Config;
import org.example.controller.UserController;
import org.example.usecase.CreateUser;
import org.example.usecase.FindUser;
import org.example.usecase.LoginUser;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

@Dependent
public class QuarkusConfiguration {

    private final Config config = new Config();

    @Produces
    public CreateUser createUser() {
        return config.createUser();
    }

    @Produces
    public FindUser findUser() {
        return config.findUser();
    }

    @Produces
    public LoginUser loginUser() {
        return config.loginUser();
    }

    @Produces
    public UserController userController() {
        return new UserController(createUser(), findUser(), loginUser());
    }



}
