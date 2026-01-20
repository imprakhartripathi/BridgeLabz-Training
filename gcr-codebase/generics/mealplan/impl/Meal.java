package generics.mealplan.impl;

public class Meal<T extends MealPlan> {
    T plan;
    public Meal(T plan) { this.plan = plan; }
}
