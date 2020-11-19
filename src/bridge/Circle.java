package bridge;
/**
 *
 * @author jzw
 * @date 2020-11-19 22:36
 * @since cloud2.0
 */
public class Circle extends Shape{

    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius,x,y);
    }
}
