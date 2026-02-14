package com.ecommerce.service.payment.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "ORDER-SERVICE")
public interface OrderClient {

    @GetMapping("/api/v1/orders")
    ResponseEntity<List<String>> orders();

    @GetMapping("/api/v1/orders/{orderId}")
    ResponseEntity<String> order(@PathVariable("orderId") String orderId);

}
