open module org.example.spring.app {

    requires org.example.usecase;
    requires spring.web;
    requires spring.beans;
    requires org.example.controller;
    requires org.example.configuration;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.annotation;

    exports org.example.springapp;
    exports org.example.springapp.config;

   // opens org.example.springapp;
   // opens org.example.springapp.config to spring.core;
   // opens org.example.springapp.controller to spring.core, spring.web, spring.beans;
}