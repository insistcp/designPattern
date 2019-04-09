package createPattern.PrototypePattern;



/**
 * Created by cp
 * data  2019/4/9.
 * description:圆形实现类
 */
public class Circle  extends Shape{
    Circle() {
        type = "Circle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() methd");
    }
}
