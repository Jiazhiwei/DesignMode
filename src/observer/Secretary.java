package observer;

import java.util.LinkedList;
import java.util.List;

/**
 * 具体通知者
 * @author jzw
 * @date 2020-11-16 21:17
 * @since cloud2.0
 */
public class Secretary implements Subject{

    /**
     * 同事列表
     */
    private List<Observer> observers = new LinkedList<>();
    private String action;

    /**
     * 添加
     * @param observer
     */
    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 删除
     */
    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 通知
     */
    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update();
        }
    }

    /**
     * 前台状态
     */
    @Override
    public String getAction() {
        return action;
    }

    @Override
    public void setAction(String action) {
        this.action = action;
    }






}
