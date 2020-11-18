package iteratorpattern;
/**
 *
 * @author jzw
 * @date 2020-11-18 22:02
 * @since cloud2.0
 */
public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();

        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String)iterator.next();
            System.out.println("Name: " + name);
        }
    }
}
