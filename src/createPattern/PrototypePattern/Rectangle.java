package createPattern.PrototypePattern;

/**
 * Created by cp
 * data  2019/4/9.
 * description: ����ʵ����
 */
public class Rectangle  extends   Shape{
    public Rectangle() {
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle:: draw() method");
    }
}
