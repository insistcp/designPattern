package createPattern;
/**
* @description 通过枚举类实现单例模式
 * 保证序列化后再读入的对象和序列化之前的对象依然是一个对象
 * 不能通过反射攻击单例
* @Author:chenpeng
* @createTime: 2019/3/26:20:29
*/
public enum  singletonPattern {
    INSTANCE;
    public void say() {
        System.out.println("I am the enum");
    }
}

/**
* @description: 懒汉式单例模式的实现 (静态变量)
* @Author:chenpeng
* @createTime: 2019/3/18:12:04
*/
class safeSingletonPattern1{
    private static safeSingletonPattern1 instance = new safeSingletonPattern1();
    private safeSingletonPattern1(){}
    public static safeSingletonPattern1 getInstance() {
        return instance;
    }
}
/**
 * @description: 懒汉式单例模式的实现 (静态变量)
 * @Author:chenpeng
 * @createTime: 2019/3/18:12:04
 */
class safeSingletonPattern2{
    private static safeSingletonPattern2 instance ;
    static {
        instance = new safeSingletonPattern2();
    }
    private safeSingletonPattern2(){}
    public static safeSingletonPattern2 getInstance() {
        return instance;
    }
}
/**
* @description
* @Author:chenpeng
* @createTime: 2019/3/18:12:09
*/
class notSafeSingletonPattern3{
    private static notSafeSingletonPattern3 instance = null;
    private notSafeSingletonPattern3(){}
    public static notSafeSingletonPattern3 getInstance() {
        if (instance == null) {
            instance = new notSafeSingletonPattern3();
        }
        return instance;
    }
}
/**
* @description 线程安全，同步方法（不推荐使用）
* @Author:chenpeng
* @createTime: 2019/3/26:20:19
*/
class safeSingletonPattern4{
    private static safeSingletonPattern4 instance = null;
    private safeSingletonPattern4(){}
    public synchronized static safeSingletonPattern4 getInstance() {
        if (instance == null) {
            instance = new safeSingletonPattern4();
        }
        return instance;
    }
}
/**
* @description  同步代码块 （并发力度低，不推荐使用）
* @Author:chenpeng
* @createTime: 2019/3/26:20:12
*/
class safeSingletonPattern5{
    private static safeSingletonPattern5 instance = null;
    private safeSingletonPattern5(){}
    public  static safeSingletonPattern5 getInstance() {
        if (instance == null){
            synchronized (safeSingletonPattern5.class){
                instance = new safeSingletonPattern5();
            }
        }
        return instance;
    }
}
/**
* @description double Check 线程安全并且，并发力度高
 * 线程安全；延迟加载；效率较高。
* @Author:chenpeng
* @createTime: 2019/3/26:20:23
*/
class safeSingletonPattern6{
    // volatile修饰的变量保证对所有线程的可见性
    private static volatile safeSingletonPattern6 instance = null;
    private safeSingletonPattern6(){}
    public  static safeSingletonPattern6 getInstance() {
        if (instance == null){
            synchronized (safeSingletonPattern6.class){
                if (instance == null) {
                    instance = new safeSingletonPattern6();
                }
            }
        }
        return instance;
    }
}
/**
* @description 静态内部类实现：JVM保证线程之间的安全性
 * 避免了线程不安全，延迟加载，效率高。
* @Author:chenpeng
* @createTime: 2019/3/26:20:26
*/
class safeSingletonPattern7{
    // volatile修饰的变量保证对所有线程的可见
    private safeSingletonPattern7(){}
    private static class InstanceInit{
        private static  final safeSingletonPattern7 instance = new safeSingletonPattern7();
    }
    public  static safeSingletonPattern7 getInstance() {
        return InstanceInit.instance;
    }
}


