package generics.mealplan;

import generics.mealplan.impl.*;

public class Driver {
    public static void main(String[] args) {
        Meal<VegetarianMeal> meal =
                new Meal<>(new VegetarianMeal());

        MealGenerator.generate(meal);
    }
}
