package gc.example.b.Model;
import lombok.Getter;
import lombok.Setter;


public class Color{
    private String color;

    public Color() {
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

    private String description;

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }
}