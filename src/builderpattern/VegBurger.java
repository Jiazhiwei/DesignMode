package builderpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 23:09
 * @since cloud2.0
 */
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }

}
