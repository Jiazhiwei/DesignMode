package adapter;
/**
 * 更高级的媒体播放器
 * @author jzw
 * @date 2020-11-17 21:36
 * @since cloud2.0
 */
public interface AdvancedMediaPlayer {

    void playVlc(String fileName);

    void playMp4(String fileName);
}
