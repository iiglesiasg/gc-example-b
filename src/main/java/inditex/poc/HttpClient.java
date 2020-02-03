package inditex.poc;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Singleton;

@Singleton
public class HttpClient {

    private final RxHttpClient httpClient;
    private final String uri;

    HttpClient(@Client("${example.host.url:`http://localhost:9002`}") RxHttpClient httpClient ){
        this.httpClient = httpClient;
        this.uri = "/colors";
    }
}
