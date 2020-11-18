package builderpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 23:07
 * @since cloud2.0
 */
public abstract class ColdDrink implements Item{

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();


}
