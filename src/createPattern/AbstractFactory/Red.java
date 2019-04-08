package createPattern.AbstractFactory;

public class Red implements Color {
    private String color;
    public Red(String color) {
        this.color = color;
    }
    @Override
    public void sayColor() {
        System.out.println("i am the "+ color+" color");
    }
}
