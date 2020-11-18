package builderpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 22:59
 * @since cloud2.0
 */
public interface Item {
    String name();

    Packing packing();

    float price();
}
