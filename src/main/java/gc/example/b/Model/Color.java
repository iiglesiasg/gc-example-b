package gc.example.b.Model;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Color{
    private String color;

    public Color() {
    }

    private String description;

    public Color(String color, String description) {
        this.color = color;
        this.description = description;
    }
}