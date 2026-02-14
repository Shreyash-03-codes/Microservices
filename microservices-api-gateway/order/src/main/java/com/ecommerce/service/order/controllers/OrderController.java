package com.ecommerce.service.order.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

    @GetMapping
    public ResponseEntity<List<String>> orders(){
        return ResponseEntity.status(HttpStatus.OK).body(List.of(
                "order for Mobile",
                "order for Laptop",
                "order for Watch",
                "order for Milk",
                "order for Notebooks"
        ));
    }

    @GetMapping("/{order}")
    public ResponseEntity<String> product(@PathVariable("order") String order){
        return ResponseEntity.status(HttpStatus.OK).body("Hey here is your order "+order);
    }
}
