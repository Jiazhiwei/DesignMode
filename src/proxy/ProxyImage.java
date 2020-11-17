package proxy;
/**
 *
 * @author jzw
 * @date 2020-11-17 22:34
 * @since cloud2.0
 */
public class ProxyImage implements Image{

    private RealImage realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
