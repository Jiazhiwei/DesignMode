package strategyfactory;
/**
 *
 * @author jzw
 * @date 2020-11-13 22:25
 * @since cloud2.0
 */
public class SilverStrategy implements Strategy{

    private static final String silverStrategy = "SilverStrategy";

    @Override
    public double compute(long money) {
        System.out.println("白金会员，优惠50元");
        return money - 50;
    }

    @Override
    public String getType() {
        return silverStrategy;
    }
}
