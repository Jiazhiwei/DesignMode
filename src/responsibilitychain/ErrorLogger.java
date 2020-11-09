package responsibilitychain;
/**
 *
 * @author jzw
 * @date 2020-11-09 21:55
 */
public class ErrorLogger extends AbstractLogger{

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:" + message);
    }
}
