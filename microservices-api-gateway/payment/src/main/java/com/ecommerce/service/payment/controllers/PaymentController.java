package com.ecommerce.service.payment.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/payments")
public class PaymentController {

    @GetMapping
    public ResponseEntity<List<String>> payments(){
        return ResponseEntity.status(HttpStatus.OK)
                .body(List.of(
                        "Payment1--> 500$ on 23/12/2024",
                        "Payment2--> 12$ on 31/01/26",
                        "Payment3--> 2$ on 14/02/25",
                        "Payment4--> 22$ on 31/03/25"
                ));
    }

    @GetMapping("/{payment}")
    public ResponseEntity<String> payment(@PathVariable("payment") String payment){
        return ResponseEntity.status(HttpStatus.OK).body("Hey here  is your payment "+payment);
    }
}
