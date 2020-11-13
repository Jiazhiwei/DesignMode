package strategyfactory;
/**
 *
 * @author jzw
 * @date 2020-11-13 22:21
 * @since cloud2.0
 */
public class OrdinaryStrategy implements Strategy{

    private static final String ordinaryStrategy = "ordinaryStrategy";

    @Override
    public double compute(long money) {
        System.out.println("普通会员不打折");
        return money;
    }

    @Override
    public String getType() {
        return ordinaryStrategy;
    }
}
