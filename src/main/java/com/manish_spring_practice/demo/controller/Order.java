package com.manish_spring_practice.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class Order {

    int orderId;

    public Order(){
        System.out.println("Order Bean created");
    }
}
