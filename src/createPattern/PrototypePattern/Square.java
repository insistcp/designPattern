package createPattern.PrototypePattern;

/**
 * Created by cp
 * data  2019/4/9.
 * description : ������ʵ����
 */
public class Square extends Shape {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
