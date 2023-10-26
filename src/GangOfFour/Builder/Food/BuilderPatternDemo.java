package GangOfFour.Builder.Food;

import java.util.Scanner;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Select a beverage:");
        System.out.println("1. Coke");
        System.out.println("2. Diet Coke");
        System.out.println("3. Pepsi");
        System.out.println("4. Diet Pepsi");
        System.out.println("5. Tea");

        int choice = scanner.nextInt();

        ColdDrink drink;
        HotDrink hdrink;
        if (choice == 1) {
            drink = new Coke();
        } else if (choice == 2) {
            drink = new DietCoke();
        } else if (choice == 3) {
            drink = new Pepsi();
        } else if (choice == 4) {
            drink = new DietPepsi();
        } else if (choice == 5) {
            hdrink = new Tea();
            System.out.println("Add cream (yes/no):");
            String addCream = scanner.next();

            System.out.println("Enter the number of spoons of sweetness:");
            int spoons = scanner.nextInt();

        }

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}
