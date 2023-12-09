package GangOfFour.Builder.Food;

public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareTeaMeal(String sweetnessType, boolean hasCream, int sweetnessSpoons) {
        Meal meal = new Meal();
        meal.addItem(new Tea(sweetnessType, hasCream, sweetnessSpoons));
        return meal;
    }

    public Meal prepareDietCokeMeal() {
        Meal meal = new Meal();
        meal.addItem(new DietCoke());
        return meal;
    }

    public Meal prepareDietPepsiMeal() {
        Meal meal = new Meal();
        meal.addItem(new DietPepsi());
        return meal;
    }

}
