package com.example.selenium.web.factory.factorymethod;

public class RectangleFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Rectangle();
    }
}
