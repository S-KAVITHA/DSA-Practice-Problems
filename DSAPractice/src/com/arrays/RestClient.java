package com.arrays;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class RestClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        // 1. Create an HttpClient
        HttpClient client = HttpClient.newHttpClient();

		/*
		 * // 2. Build an HttpRequest HttpRequest request = HttpRequest.newBuilder()
		 * .uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")) .GET()
		 * .build();
		 */

        
        
        // 2. Build an HttpRequest
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8080/api/tutorials")) 
                .GET() 
                .build();
        
        
        // 3. Send the request and handle the response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 4. Process the response
        System.out.println("Status code: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }
    
    
   /* 
    import java.io.IOException;
    import java.net.URI;
    import java.net.http.HttpClient;
    import java.net.http.HttpRequest;
    import java.net.http.HttpResponse;

    public class HttpClientWithToken {

        public static void main(String[] args) throws IOException, InterruptedException {
            String url = "your_url_here";
            String token = "your_token_here";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Authorization", "Bearer " + token)
                    .GET() // or .POST(HttpRequest.BodyPublishers.ofString("your request body")) for POST requests
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body: " + response.body());
        }
    }*/
    
}
