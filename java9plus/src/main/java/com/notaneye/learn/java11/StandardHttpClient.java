package com.notaneye.learn.java11;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;
import java.time.Duration;
import java.util.Optional;


/**
 * @see java.net.http
 */
public class StandardHttpClient {

    public static void main(String[] args) throws IOException, InterruptedException {

        String apiKey = Optional
                .ofNullable(args.length >= 1 ? args[0] : null)
                .orElseThrow(() -> new RuntimeException("OMDB API key is required"));
        // Build the client. Numerous options can be set here, which will apply
        // to all requests made with this client. HttpClients are thread-safe,
        // so they can be reused.
        HttpClient client = HttpClient
                .newBuilder()
                .connectTimeout(Duration.ofSeconds(5))
                .followRedirects(Redirect.NORMAL)
                .version(Version.HTTP_1_1)
                .build();
        // Build the request. The request should *not* be used multiple times,
        // but the builder object can be reused to create numerous identical
        // requests. The builder can also be configured with some common values,
        // and then copied to set different values on each one.
        HttpRequest request = HttpRequest
                .newBuilder()
                .GET()
                .uri(URI.create("http://www.omdbapi.com/?apikey=%s&t=back+to+the+future".formatted(apiKey)))
                .build();
        // Send the request synchronously, and handle the response. The body
        // will be converted to a string by the BodyHandler.
        var response = client.send(request, BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
