package createPattern.PrototypePattern;

/**
 * Created by cp
 * data  2019/4/9.
 * description: ԭ��ģʽ���������������ظ��Ķ��󣬹����ӿ���Ҫʵ��cloneable�ӿ�
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
