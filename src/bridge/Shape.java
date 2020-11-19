package bridge;
/**
 *
 * @author jzw
 * @date 2020-11-19 22:36
 * @since cloud2.0
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
