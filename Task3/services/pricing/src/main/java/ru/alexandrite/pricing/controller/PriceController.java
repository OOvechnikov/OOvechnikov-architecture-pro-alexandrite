package ru.alexandrite.pricing.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    @GetMapping("/{product}/price")
    public ResponseEntity<Double> getProductPrice(@PathVariable("product") String product) {
        return ResponseEntity.ok(Math.random() * 1000);
    }

}
