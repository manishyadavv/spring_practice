package com.manish_spring_practice.demo.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class OfflineOrder implements Order {

    OfflineOrder(){
        System.out.println("OfflineOrder");
    }
}
