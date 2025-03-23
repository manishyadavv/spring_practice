package com.manish_spring_practice.demo.controller;


import org.springframework.stereotype.Component;

@Component
public class Invoice {

    int invoiceId;

    public Invoice(){
        System.out.println("Invoice bean created");
    }
}
