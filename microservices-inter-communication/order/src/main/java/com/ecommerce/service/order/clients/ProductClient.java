package com.ecommerce.service.order.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "product-service")
public interface ProductClient {

    @GetMapping("/api/v1/products/{productId}")
    ResponseEntity<String> product(@PathVariable("productId") String productId);

    @GetMapping("/api/v1/products")
    ResponseEntity<List<String>> products();
}
