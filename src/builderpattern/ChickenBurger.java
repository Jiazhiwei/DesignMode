package builderpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 23:11
 * @since cloud2.0
 */
public class ChickenBurger extends Burger{

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
