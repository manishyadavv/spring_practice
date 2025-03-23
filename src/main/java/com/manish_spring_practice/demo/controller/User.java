package com.manish_spring_practice.demo.controller;


import org.springframework.stereotype.Component;

@Component
public class User {

    Order order;

    Invoice invoice;

    public User(Order order){
        this.order = order;
    }

}
