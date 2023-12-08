package GangOfFour.Adapter.AdvancedMediaPlayer;

public class MediaAdapter implements MediaPlayer {
   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType) {
      if (audioType.equalsIgnoreCase("vlc")) {
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMusicPlayer = new Mp4Player();
      } else if (audioType.equalsIgnoreCase("wav")) {
         advancedMusicPlayer = new WavPlayer();
      } else if (audioType.equalsIgnoreCase("ogg")) {
         advancedMusicPlayer = new OggPlayer();
      }
   }

   @Override
   public void play(String audioType, String fileName) {
      if (audioType.equalsIgnoreCase("vlc")) {
         advancedMusicPlayer.play(fileName);
      } else if (audioType.equalsIgnoreCase("mp4")) {
         advancedMusicPlayer.play(fileName);
      }
   }
}
