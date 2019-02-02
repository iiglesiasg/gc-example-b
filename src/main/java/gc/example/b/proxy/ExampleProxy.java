package gc.example.b.proxy;

import gc.example.b.Model.Color;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;
import io.reactivex.Flowable;

@Client("http://localhost:9001")
public interface ExampleProxy {

    @Get("/colors")
    Flowable<Color> getColors();
}
