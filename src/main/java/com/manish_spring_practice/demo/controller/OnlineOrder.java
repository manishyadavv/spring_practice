package com.manish_spring_practice.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class OnlineOrder implements Order{
    public OnlineOrder(){
        System.out.println("OnlineOrder");
    }
}
