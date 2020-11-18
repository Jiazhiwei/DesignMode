package template;
/**
 *
 * @author jzw
 * @date 2020-11-18 21:33
 * @since cloud2.0
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
