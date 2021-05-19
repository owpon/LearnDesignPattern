package Builderpattern;

/**
 * @author ziv
 * @date 2021-05-19 11:51 上午
 * @description
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素食品項");
        vegMeal.showItems();
        System.out.println("總消費：" + vegMeal.getCost());
        Meal noneVegMeal = mealBuilder.prepareNoneVegMeal();
        System.out.println("葷食");
        noneVegMeal.showItems();
        System.out.println("總消費：" + vegMeal.getCost());

    }
}
