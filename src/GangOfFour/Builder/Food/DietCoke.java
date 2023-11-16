package GangOfFour.Builder.Food;

public class DietCoke extends ColdDrink {   

    @Override
   public float price() {
      return 30.0f + 5.0f;
   }

   @Override
   public String name() {
      return "Diet Coke";
   }
}