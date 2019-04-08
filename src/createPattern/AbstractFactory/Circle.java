package createPattern.AbstractFactory;

public class Circle implements Shape {
    private String shape;
    public Circle(String shape) {
        this.shape = shape;
    }
    @Override
    public void sayShape() {
        System.out.println("i am a "+ shape + " shape");
    }
}
