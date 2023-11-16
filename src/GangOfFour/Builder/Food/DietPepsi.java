package GangOfFour.Builder.Food;

public class DietPepsi extends ColdDrink {   

    @Override
   public float price() {
      return 35.0f + 5.0f;
   }

   @Override
   public String name() {
      return "Diet Pepsi";
   }
}
