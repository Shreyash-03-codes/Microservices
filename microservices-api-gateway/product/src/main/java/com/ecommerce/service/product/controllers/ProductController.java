package com.ecommerce.service.product.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<String>> products(){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(List.of(
                        "Laptop",
                        "Mobile",
                        "Bags",
                        "Milk",
                        "Dress"
                ));
    }

    @GetMapping("/{product}")
    public ResponseEntity<String> product(@PathVariable("product") String product){
        return ResponseEntity
                .status(HttpStatus.OK)
                .body("Here is your product "+product);
    }
}
