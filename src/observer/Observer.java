package observer;
/**
 * 观察者
 * @author jzw
 * @date 2020-11-16 21:11
 * @since cloud2.0
 */
public abstract class Observer {

    protected String name;
    protected Subject subject;

    public Observer(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public abstract void update();
}
