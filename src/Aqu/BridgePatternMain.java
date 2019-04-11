package Aqu;

import Aqu.implement.Circle;
import Aqu.implement.GreenCircle;
import Aqu.implement.RedCircle;
import Aqu.interfaces.Shape;


/**
 * @Author: chenpeng
 * @Date: 2019/4/11 11:53
 * @Description: 桥接模式：将抽象和实现分类，利用一个桥接接口类
 *
 *    Shape
 *  BridgeAPI
 * greenCircle extends BridageAPI redCircle extends BridageAPI
 *
 * 将
 */
public class BridgePatternMain {
    public static void main(String[] args) {
        GreenCircle greenCircle = new GreenCircle();
        RedCircle redCircle = new RedCircle();
        Circle gCircle = new Circle(1,1,2,greenCircle);
        gCircle.draw();
        Circle rCircle = new Circle(2,2,4,redCircle);
        rCircle.draw();

    }
}