package com.example.selenium.web.Builder;

public class KFCWaiter {

    private MealBuilder mealBuilder;

    public KFCWaiter(MealBuilder mealBuilder){
        this.mealBuilder = mealBuilder;
    }

    public Meal construct(){
        mealBuilder.buildDrink();
        mealBuilder.buildFood();
        return mealBuilder.getMeal();
    }
}
