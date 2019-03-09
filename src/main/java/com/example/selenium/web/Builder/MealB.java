package com.example.selenium.web.Builder;

public class MealB extends MealBuilder{
    @Override
    public void buildFood() {
        meal.setFood("汉堡+鸡翅");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("可乐");
    }
}
