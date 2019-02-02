package gc.example.b.Controller;

import gc.example.b.Model.Color;
import gc.example.b.Model.Colorb;
import gc.example.b.proxy.ExampleProxy;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Flowable;

@Controller("/colors")
public class ExampleController {

    private final ExampleProxy proxy;

    public ExampleController(ExampleProxy proxy) {
        this.proxy = proxy;
    }

    @Get("/")
    @Produces(MediaType.APPLICATION_JSON_STREAM)
    public Flowable<Color> getColors() {
        return proxy.getColors();
    }
}