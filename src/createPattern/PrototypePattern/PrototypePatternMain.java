package createPattern.PrototypePattern;

/**
 * Created by cp
 * data  2019/4/9.
 * description: 原型模式：用来创建大量重复的对象，公共接口需要实现cloneable接口
 */
public class PrototypePatternMain {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        Shape cloneShape0 = ShapeCache.getShape("1");
        System.out.println("shape--->"+ cloneShape0.getType());
        Shape cloneShape1 = ShapeCache.getShape("2");
        System.out.println("shape--->"+ cloneShape1.getType());
        Shape cloneShape2 = ShapeCache.getShape("3");
        System.out.println("shape--->"+ cloneShape2.getType());
    }
}
