package com.example.selenium.web.factory.simplefactory;

public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("Circle");
        circle.draw();

        Rectangle rectangle = (Rectangle) ShapeFactory.getClass(Rectangle.class);
        rectangle.draw();
    }
}
