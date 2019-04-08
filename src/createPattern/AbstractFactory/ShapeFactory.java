package createPattern.AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
      return null;
    }
    @Override
    public Shape getShape(String shape){
        if (shape.equals("circle")) {
            return new Circle("circle");
        } else if (shape.equals("Rectangle")) {
            return new Rectangle("Rectangle");
        } else {
            return null;
        }
    }
}
