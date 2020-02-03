package inditex.poc;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Client("${example.host.url:`http://localhost:9002`}")
public interface Proxy {
    @Get("/colors")
    Flowable<Color> getColors();
}

