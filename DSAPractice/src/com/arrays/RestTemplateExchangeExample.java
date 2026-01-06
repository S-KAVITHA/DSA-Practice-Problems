package com.arrays;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

public class RestTemplateExchangeExample {

    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://httpbin.org/get";

        // Prepare headers
        HttpHeaders headers = new HttpHeaders();
        headers.set("Custom-Header", "CustomValue");

        // Prepare request entity
        HttpEntity requestEntity = new HttpEntity<>(headers);

        // Perform exchange
        ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, String.class);

        // Process response
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            System.out.println("Response Status Code: " + responseEntity.getStatusCode());
            System.out.println("Response Headers: " + responseEntity.getHeaders());
            System.out.println("Response Body: " + responseEntity.getBody());
        } else {
            System.err.println("Request failed with status code: " + responseEntity.getStatusCode());
        }
    }
}