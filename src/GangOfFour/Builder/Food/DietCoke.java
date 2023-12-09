package GangOfFour.Builder.Food;

public class DietCoke extends ColdDrink implements DietDrink {

   @Override
   public float price() {
      return 25.0f; // Assuming a specific price for Diet Coke
   }

   @Override
   public String name() {
      return "Diet Coke";
   }
}