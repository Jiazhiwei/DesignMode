package responsibilitychain.FilterChain;

import java.sql.SQLSyntaxErrorException;

/**
 *
 * @author jzw
 * @date 2020-11-12 19:24
 * @since cloud2.0
 */
public class HTMLFilter implements Filter{

    @Override
    public void doFilter(RequestInface request, ResponseInface response, FilterChain filterChain) {
        StringBuffer sb = new StringBuffer();
        sb.append("--HTMLFilter处理过--");
        request.setRequestStr(sb.toString());
        response.setResponseStr(sb.toString());
        filterChain.doFilter(request,response);
        System.out.println("--HTMLFilter处理过--");
    }
}
