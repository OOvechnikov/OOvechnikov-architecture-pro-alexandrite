package ru.alexandrite.order.controller;

import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final RestTemplate restTemplate;

    @Value("${PRICING_SERVICE_URL:http://localhost:8081/}")
    private String pricingServiceUrl;

    @GetMapping("/order/{product}")
    public ResponseEntity<String> getProduct(@PathVariable("product") String product) {
        val responseEntity = restTemplate.getForEntity(pricingServiceUrl + product + "/price", Double.class, product);
        val price = responseEntity.getBody();

        return ResponseEntity.ok("Price for '%s' is '%f'".formatted(product, price));
    }

}
