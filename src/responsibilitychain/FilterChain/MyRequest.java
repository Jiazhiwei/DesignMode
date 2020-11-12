package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:38
 * @since cloud2.0
 */
public class MyRequest implements RequestInface{

    private String requestStr;

    @Override
    public String getRequestStr() {
        return requestStr;
    }

    @Override
    public void setRequestStr(String requestStr) {
        this.requestStr = requestStr;
    }
}
