import createPattern.singletonPattern;

public class Main {

    public static void main(String[] args) {
        singletonPattern instance = singletonPattern.INSTANCE;
        instance.say();
//DEAD
        System.out.println("Hello World!");
        // IDEA 123223232
    }
}
