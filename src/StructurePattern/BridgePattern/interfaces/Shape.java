package StructurePattern.BridgePattern.interfaces;

/**
 * @Author: chenpeng
 * @Date: 2019/4/11 11:55
 * @Description: 抽象接口
 */
public  abstract  class Shape {
    protected BridgeAPI bridgeAPI;
    protected Shape(BridgeAPI bridgeAPI) {
        this.bridgeAPI = bridgeAPI;
    }
    public abstract void draw();
}