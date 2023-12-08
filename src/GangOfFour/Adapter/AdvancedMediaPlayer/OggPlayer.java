package GangOfFour.Adapter.AdvancedMediaPlayer;

public class OggPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing ogg file. Name: " + fileName);
   }
}