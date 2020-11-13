package strategyfactory;
/**
 *
 * @author jzw
 * @date 2020-11-13 22:39
 * @since cloud2.0
 */
public class Strategyfactorytest {

    public static void main(String[] args) {
        System.out.println(Strategyfactorytest.getResult(2000,"ordinaryStrategy"));
        System.out.println(Strategyfactorytest.getResult(1000, "SilverStrategy"));
    }

    public static double getResult(long money, String type) {
        if (money < 1000) {
            return money;
        }

        Strategy strategy = StrategyFactory.getInstance().get(type);
        if (strategy == null) {
            throw new IllegalArgumentException("please input rigth type");
        }

        return strategy.compute(money);
    }
}
