package bridge;
/**
 *
 * @author jzw
 * @date 2020-11-19 22:33
 * @since cloud2.0
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
