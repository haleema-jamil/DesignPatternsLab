package GangOfFour.Builder.Food;

public class Tea implements Item {

   private String sweetnessType;
   private boolean hasCream;
   private int sweetnessSpoons;

   public Tea(String sweetnessType, boolean hasCream, int sweetnessSpoons) {
      this.sweetnessType = sweetnessType;
      this.hasCream = hasCream;
      this.sweetnessSpoons = sweetnessSpoons;
   }

   @Override
   public String name() {
      return "Tea";
   }

   @Override
   public Packing packing() {
      return new Bottle(); // Assuming Tea is packed in a bottle
   }

   @Override
   public float price() {
      float basePrice = 15.0f; // Assuming a base price for Tea
      float additionalPrice = 0.0f;

      // Add additional price for each decoration
      if (hasCream) {
         additionalPrice += 5.0f;
      }

      // You can customize additional decorations and their prices here

      return basePrice + additionalPrice;
   }

   public String getSweetnessType() {
      return sweetnessType;
   }

   public boolean hasCream() {
      return hasCream;
   }

   public int getSweetnessSpoons() {
      return sweetnessSpoons;
   }
}

