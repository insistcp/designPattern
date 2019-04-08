package createPattern.factory;

public class Banana implements Fruit {
    private String name;
    public Banana (String name) {
        this.name = name;
    }
    public void sayName(){
        System.out.println("I am a fruit and is a "+ this.name);
    } ;
}
