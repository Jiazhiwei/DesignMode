package observer;

/**
 * 具体观察者
 * @author jzw
 * @date 2020-11-16 21:49
 * @since cloud2.0
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "关闭NBA直播，继续工作");
    }
}
