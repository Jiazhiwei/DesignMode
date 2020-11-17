package proxy;
/**
 *
 * @author jzw
 * @date 2020-11-17 22:30
 * @since cloud2.0
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loading" + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying" + fileName);
    }
}
