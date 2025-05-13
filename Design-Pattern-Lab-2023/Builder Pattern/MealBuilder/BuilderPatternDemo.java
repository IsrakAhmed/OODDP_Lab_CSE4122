public class BuilderPatternDemo {
    public static void main(String[] args){
        
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.preapareNonVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.preapareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItem();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}