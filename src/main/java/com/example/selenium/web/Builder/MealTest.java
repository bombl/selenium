package com.example.selenium.web.Builder;

public class MealTest {

    public static void main(String[] args) {
        MealA a = new MealA();
        KFCWaiter waiter = new KFCWaiter(a);
        Meal mealA = waiter.construct();
        System.out.println("套餐A的组成：food"+mealA.getFood()+",drink"+mealA.getDrink());
    }
}
