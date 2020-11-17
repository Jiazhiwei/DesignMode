package adapter;
/**
 *
 * @author jzw
 * @date 2020-11-17 21:54
 * @since cloud2.0
 */
public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 播放MP3音乐文件的支持
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+ fileName);
        }

        // mediaAdapter 提供了播放其他文件格式的支持
        else if (audioType.equalsIgnoreCase("vlc") ||
        audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media. "+
                    audioType + " format not supported");
        }
    }
}
