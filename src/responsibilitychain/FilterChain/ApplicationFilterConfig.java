package responsibilitychain.FilterChain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jzw
 * @date 2020-11-12 19:31
 * @since cloud2.0
 */
public class ApplicationFilterConfig {

    public List<Filter> filterList = new ArrayList<>();

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public List<Filter> getFilters() {
        return filterList;
    }
}
