package Aqu.implement;

import Aqu.interfaces.BridgeAPI;
import Aqu.interfaces.Shape;

/**
 * @Author: chenpeng
 * @Date: 2019/4/11 11:59
 * @Description : 圆圈的实现类
 */
public class Circle extends Shape{
    private int x;
    private int y;
    private int radius;
    public Circle(int x, int y , int radius, BridgeAPI bridgeAPI) {
        super(bridgeAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    @Override
    public void draw() {
        bridgeAPI.drawCircle(radius, x, y);
    }
}