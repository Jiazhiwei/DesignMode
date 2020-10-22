import singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        // 单例模式
        //不合法的构造函数
        //编译时错误：构造函数 SingleObject() 是不可见的
        //SingleObject object = new SingleObject();

        // 获取唯一可用对象
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

    }
}
