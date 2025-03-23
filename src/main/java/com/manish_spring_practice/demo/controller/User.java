package com.manish_spring_practice.demo.controller;


import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
    @Autowired
    Order order;



    public User(Order order){
        this.order = order;
        System.out.println("User initialized");
    }

}
