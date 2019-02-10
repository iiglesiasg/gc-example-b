package gc.example.b.Model;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Colorb {
    private String color;
    private String description;
    private String b;

    public Colorb() {
    }

    public Colorb(String color, String description, String b) {
        this.color = color;
        this.description = description;
        this.b = b;
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

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}