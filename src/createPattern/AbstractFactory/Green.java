package createPattern.AbstractFactory;

public class Green implements Color {
    private String color;
    public Green(String color) {
        this.color = color;
    }
    @Override
    public void sayColor() {
        System.out.println("i am the "+ color+" color");
    }
}
