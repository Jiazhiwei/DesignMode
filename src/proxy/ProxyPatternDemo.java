package proxy;
/**
 *
 * @author jzw
 * @date 2020-11-17 22:36
 * @since cloud2.0
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图片从磁盘加载
        image.display();
        System.out.println("");

        // 图片不需要从磁盘加载
        image.display();
    }
}
