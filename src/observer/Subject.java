package observer;
/**
 * 通知者接口
 * @author jzw
 * @date 2020-11-16 21:06
 * @since cloud2.0
 */
public interface Subject {

    /**
     *增加
     */
    void attach(Observer observer);

    /**
     * 删除
     */
    void detach(Observer observer);

    /**
     * 通知
     */
    void notifyObservers();

    /**
     * 状态
     */
    void setAction(String action);

    String getAction();



}
