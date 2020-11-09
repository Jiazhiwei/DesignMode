package responsibilitychain;
/**
 *
 * @author jzw
 * @date 2020-11-09 21:57
 */
public class FileLogger extends AbstractLogger{

    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
