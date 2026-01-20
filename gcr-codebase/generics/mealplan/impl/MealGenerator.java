package generics.mealplan.impl;

public class MealGenerator {
    public static <T extends Meal<?>> void generate(T meal) {
        System.out.println("Generated meal plan.");
    }
}
