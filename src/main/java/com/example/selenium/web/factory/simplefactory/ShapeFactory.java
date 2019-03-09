package com.example.selenium.web.factory.simplefactory;

import org.apache.commons.lang3.StringUtils;

public class ShapeFactory {

    public static Shape getShape(String shapeType){

        if(StringUtils.isBlank(shapeType)){
            System.out.println("shapeType is null");
        }

        if(shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }

        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }

        return null;
    }

    public static Object getClass(Class<? extends Shape> clazz){
        Object obj = null;
        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return obj;
    }
}
