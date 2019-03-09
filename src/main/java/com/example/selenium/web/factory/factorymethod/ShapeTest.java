package com.example.selenium.web.factory.factorymethod;

public class ShapeTest {

    public static void main(String[] args) {
        ShapeFactory factory = new CircleFactory();
        Shape circle = factory.getShape();
        circle.draw();
    }
}
