package strategyfactory;
/**
 *
 * @author jzw
 * @date 2020-11-13 22:19
 * @since cloud2.0
 */
public interface Strategy {

    /**
     * 计算方法
     * @param money
     * @return
     */
    double compute(long money);

    /**
     * 返回当前类型
     * @return
     */
    String getType();
}
