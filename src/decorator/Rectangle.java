package decorator;
/**
 *
 * @author jzw
 * @date 2020-11-16 22:36
 * @since cloud2.0
 */
public class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
