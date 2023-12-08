package GangOfFour.Adapter.AdvancedMediaPlayer;

public class WavPlayer implements AdvancedMediaPlayer {
   @Override
   public void play(String fileName) {
      System.out.println("Playing wav file. Name: " + fileName);
   }
}
