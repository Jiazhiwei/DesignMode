package responsibilitychain.FilterChain;

import java.util.List;

/**
 *
 * @author jzw
 * @date 2020-11-12 19:29
 * @since cloud2.0
 */
public class MyFilterChain implements FilterChain{

    private int index = 1;

    private ApplicationFilterConfig applicationFilterConfig;

    @Override
    public void doFilter(RequestInface request, ResponseInface response) {
        System.out.println(request.getRequestStr());
        System.out.println(response.getResponseStr());
        List<Filter> filters = applicationFilterConfig.getFilters();
        if (index == filters.size()) {
            return;
        }else {
            Filter f = filters.get(index);
            index ++;
            f.doFilter(request, response, this);
        }
    }

    public MyFilterChain(ApplicationFilterConfig applicationFilterConfig) {
        super();
        this.applicationFilterConfig = applicationFilterConfig;
    }

}
