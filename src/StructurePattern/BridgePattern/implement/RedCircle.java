package Aqu.implement;

import Aqu.interfaces.BridgeAPI;

/**
 * @Author: chenpeng
 * @Date: 2019/4/11 11:56
 * @Description : 画红圈实现类
 */
public class RedCircle  implements BridgeAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color : red, radius: " +  radius+",x: "+x + ",y:" + y +"]");
    }
}