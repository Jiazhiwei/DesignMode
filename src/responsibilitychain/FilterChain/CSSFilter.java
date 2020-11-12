package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:20
 * @since cloud2.0
 */
public class CSSFilter implements Filter{

    @Override
    public void doFilter(RequestInface request, ResponseInface response, FilterChain filterChain) {
        StringBuffer sb = new StringBuffer(request.getRequestStr());
        sb.append("CSSFilter处理过");
        request.setRequestStr(sb.toString());
        filterChain.doFilter(request, response);
        response.setResponseStr(sb.toString());
        System.out.println("CSSFilter处理过");
    }

}
