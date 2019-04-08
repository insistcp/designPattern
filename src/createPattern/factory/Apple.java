package createPattern.factory;

public class Apple implements Fruit {
    private String name;
    public Apple(String name){
        this.name = name;
    }
    @Override
    public void sayName() {
        System.out.println("I am a fruit and is a "+ this.name);
    }
}
