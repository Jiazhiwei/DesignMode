package template;
/**
 *
 * @author jzw
 * @date 2020-11-18 21:25
 * @since cloud2.0
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * 模板
     */
    public final void play() {

        // 初始化游戏
        initialize();

        // 开始游戏
        startPlay();

        // 结束游戏
        endPlay();
    }
}
