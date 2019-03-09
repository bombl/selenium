package com.example.selenium.web.Builder;

public class MealA extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("汉堡+薯条");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
