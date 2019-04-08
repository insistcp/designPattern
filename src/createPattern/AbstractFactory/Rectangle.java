package createPattern.AbstractFactory;

public class Rectangle implements Shape {
    private String shape;
    public Rectangle(String shape) {
        this.shape = shape;
    }
    @Override
    public void sayShape() {
        System.out.println("i am a "+ shape + " shape");
    }
}
