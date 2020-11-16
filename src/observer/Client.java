package observer;
/**
 *
 * @author jzw
 * @date 2020-11-16 21:30
 * @since cloud2.0
 */
public class Client {

    public static void main(String[] args) {
        // 前台作为通知者
        Secretary secretary = new Secretary();
        StockObserver  stockObserver = new StockObserver("adam", secretary);
        NBAObserver nbaObserver = new NBAObserver("tom", secretary);

        //  前台通知
        secretary.attach(stockObserver);
        secretary.attach(nbaObserver);


        // 老板回来了
        secretary.setAction("小心，老板回来了");
        secretary.notifyObservers();
    }
}
