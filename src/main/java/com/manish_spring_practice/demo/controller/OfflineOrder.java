package com.manish_spring_practice.demo.controller;

import org.springframework.stereotype.Component;

@Component
public class OfflineOrder implements Order {

    OfflineOrder(){
        System.out.println("OfflineOrder");
    }
}
