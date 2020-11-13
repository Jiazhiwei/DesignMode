package strategyfactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author jzw
 * @date 2020-11-13 22:28
 * @since cloud2.0
 */
public class StrategyFactory {

    private Map<String, Strategy> map;

    private StrategyFactory() {
        List<Strategy> strategyList = new ArrayList<>();

        // 将所有工厂实现类都放在一起
        strategyList.add(new OrdinaryStrategy());
        strategyList.add(new SilverStrategy());

        //  collect收集，把strategies的流的值都收集起来，转换成Map<key,value>
        map = strategyList.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));
    }

    // 静态内部类去实现单例模式

    private static class DealWith {
        private static StrategyFactory strategyFactory = new StrategyFactory();
    }

    public static StrategyFactory getInstance() {
        return DealWith.strategyFactory;
    }

    public Strategy get(String type) {
        return map.get(type);
    }
}
