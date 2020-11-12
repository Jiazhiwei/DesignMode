package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:13
 * @since cloud2.0
 */
public interface Filter {

    public void doFilter(RequestInface request, ResponseInface response, FilterChain filterChain);

}
