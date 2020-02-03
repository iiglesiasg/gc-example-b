package inditex.poc;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.reactivex.Flowable;

@Controller("/client")
public class SimpleLogController {

    private final Proxy proxy;


    public SimpleLogController(Proxy proxy) {
        this.proxy = proxy;
    }

    @Get(value = "/",produces = MediaType.APPLICATION_JSON_STREAM)
    public Flowable<ColorClient> getColors() {
        return proxy.getColors()
                .map(color -> new ColorClient(color.getColor(),color.getDescription(),"Pasa por el servicio cliente"));
    }

}
