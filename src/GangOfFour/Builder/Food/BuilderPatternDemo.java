package GangOfFour.Builder.Food;

import java.util.Scanner;

public class BuilderPatternDemo {
   public static void main(String[] args) {

      MealBuilder mealBuilder = new MealBuilder();
      Scanner scanner = new Scanner(System.in);

      System.out.println("Select your meal options:");
      System.out.println("1. Veg Meal");
      System.out.println("2. Non-Veg Meal");
      System.out.println("3. Diet Coke Meal");
      System.out.println("4. Diet Pepsi Meal");
      System.out.println("5. Tea Meal");

      int choice = scanner.nextInt();
      Meal meal = null;

      switch (choice) {
         case 1:
            meal = mealBuilder.prepareVegMeal();
            break;
         case 2:
            meal = mealBuilder.prepareNonVegMeal();
            break;
         case 3:
            meal = mealBuilder.prepareDietCokeMeal();
            break;
         case 4:
            meal = mealBuilder.prepareDietPepsiMeal();
            break;
         case 5:
            System.out.println("Enter sweetness type (e.g., Low, Medium, High): ");
            String sweetnessType = scanner.next();
            System.out.println("Add cream? (true/false): ");
            boolean hasCream = scanner.nextBoolean();
            System.out.println("Enter sweetness spoons count: ");
            int sweetnessSpoons = scanner.nextInt();
            meal = mealBuilder.prepareTeaMeal(sweetnessType, hasCream, sweetnessSpoons);
            break;
         default:
            System.out.println("Invalid choice");
            return;
      }

      System.out.println("Your selected meal:");
      meal.showItems();
      System.out.println("Total Cost: " + meal.getCost());

      scanner.close();
   }
}
