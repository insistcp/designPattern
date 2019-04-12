package StructurePattern.BridgePattern.implement;

import StructurePattern.BridgePattern.interfaces.BridgeAPI;

/**
 * @Author: chenpeng
 * @Date: 2019/4/11 11:56
 * @Description : 画绿圈实现类
 */
public class GreenCircle implements BridgeAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle [color : green, radius:" +  radius+" ,x:"+x + " ,y:" + y +"]");
    }
}