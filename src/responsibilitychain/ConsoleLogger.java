package responsibilitychain;/**
 *
 * @author jzw
 * @date 2020-11-09 21:49
 */
public class ConsoleLogger extends AbstractLogger{

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger" + message);
    }
}
