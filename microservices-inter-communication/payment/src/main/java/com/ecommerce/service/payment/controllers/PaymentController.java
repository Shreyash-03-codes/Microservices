package com.ecommerce.service.payment.controllers;

import com.ecommerce.service.payment.clients.OrderClient;
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
@RequestMapping("/api/v1/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final OrderClient orderClient;

    @GetMapping
    public ResponseEntity<List<String>> payments(){
        List<String> orders=orderClient.orders().getBody();
        List<String> payments=new ArrayList<>();
        for(String order:orders){
            payments.add("The payment *** for the "+order);
        }
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(payments);
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<String> payment(@PathVariable("paymentId") String paymentId){
        String orders=orderClient.order("shreyashordera231").getBody();
        String payment="the payment "+paymentId+" *** for the "+orders;

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(payment);
    }


}
