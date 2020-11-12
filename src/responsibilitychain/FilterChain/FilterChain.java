package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:18
 * @since cloud2.0
 */
public interface FilterChain {

    public void doFilter(RequestInface request, ResponseInface response);
}
