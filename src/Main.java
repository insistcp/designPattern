import createPattern.singletonPattern;

public class Main {

    public static void main(String[] args) {
        singletonPattern instance = singletonPattern.INSTANCE;
        instance.say();
        System.out.println("Hello World!");
        // IDEA
    }
}
