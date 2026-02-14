package com.ecommerce.service.order.controllers;

import com.ecommerce.service.order.clients.ProductClient;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {

    private final ProductClient productClient;

    @GetMapping
    public ResponseEntity<List<String>> orders(){
        List<String> products=productClient.products().getBody();
        List<String> orders=new ArrayList<>();
        for(String product:products){
            orders.add("The product is "+product);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(orders);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<String> order(@PathVariable("orderId") String orderId){
        String order=productClient.product("laptop").getBody()+" product for "+orderId;
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(order);
    }
}
