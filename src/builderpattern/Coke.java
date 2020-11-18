package builderpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 23:13
 * @since cloud2.0
 */
public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
