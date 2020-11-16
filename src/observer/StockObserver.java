package observer;
/**
 * 具体观察者
 * @author jzw
 * @date 2020-11-16 21:28
 * @since cloud2.0
 */
public class StockObserver extends Observer{

    public StockObserver(String  name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "关闭股票行情，继续工作");
    }

}
