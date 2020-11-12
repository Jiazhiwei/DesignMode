package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:40
 * @since cloud2.0
 */
public class MyResponse implements ResponseInface{

    private String responseStr;

    @Override
    public String  getResponseStr() {
        return responseStr;
    }

    @Override
    public void setResponseStr(String responseStr) {
        this.responseStr = responseStr;
    }
}
