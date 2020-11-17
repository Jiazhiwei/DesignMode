package adapter;
/**
 * vlcPlayer 播放器
 * @author jzw
 * @date 2020-11-17 21:39
 * @since cloud2.0
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // 什么也不做
    }
}
