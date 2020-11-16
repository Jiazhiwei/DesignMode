package decorator;
/**
 *
 * @author jzw
 * @date 2020-11-16 22:37
 * @since cloud2.0
 */
public class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
