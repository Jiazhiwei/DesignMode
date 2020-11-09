package singleton;
/**
 *
 * @author jzw
 * @date 2020-10-21 22:23
 */
public class Singleton {
    // 创建一个Singleton的一个对象
    private static Singleton singleton = new Singleton();

    /** 让构造函数为private,这样该类就不会被实例化*/
    private Singleton(){}

    /** 获取唯一可用的对象 */
    public static Singleton getInstance() {
        return singleton;
    }

    public void showMessage() {
        System.out.println("单例模式---Hello World");
    }



}
