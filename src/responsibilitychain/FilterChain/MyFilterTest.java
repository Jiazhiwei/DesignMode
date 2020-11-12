package responsibilitychain.FilterChain;
/**
 *
 * @author jzw
 * @date 2020-11-12 19:42
 * @since cloud2.0
 */
public class MyFilterTest {

    public static void main(String[] args) {
        //web容器首先new出一个ApplicationFilterConfig对象，并读取本应用程序中所有配置的过滤器，将其存放在ApplicationFilterConfig中
        ApplicationFilterConfig applicationFilterConfig = new ApplicationFilterConfig();

        // 读取本程序中配置的所有过滤器
        Filter htmlFilter = new HTMLFilter();
        Filter cssFilter = new CSSFilter();

        // 将过滤器放到applicationFilterConfig 中
        applicationFilterConfig.addFilter(htmlFilter);
        applicationFilterConfig.addFilter(cssFilter);


        //web容器创建RequestInface对象，ResponseInface对象，FilterChain对象
        RequestInface requestInface = new MyRequest();
        ResponseInface responseInface = new MyResponse();
        FilterChain filterChain = new MyFilterChain(applicationFilterConfig);

        // 我们从客户端接收信息
        String requestmessage = "request---我们正在测试责任链模式";
        requestInface.setRequestStr(requestmessage);
        String reponsemessage  = "response---我们在测试责任链";
        responseInface.setResponseStr(reponsemessage);
        htmlFilter.doFilter(requestInface,responseInface,filterChain);

    }
}
