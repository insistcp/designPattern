package createPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equals("red")) {
            return new Red("red");
        } else if (color.equals("green")) {
            return new Green("green");
        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
