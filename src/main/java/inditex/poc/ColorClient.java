package inditex.poc;

import io.micronaut.core.annotation.Introspected;

@Introspected
public class ColorClient {
    private String color;
    private String description;
    private String client;

    public ColorClient(String color, String description, String client) {
        this.color = color;
        this.description = description;
        this.client = client;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

}
