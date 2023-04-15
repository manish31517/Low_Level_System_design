package FactoryDesingPattern;

import java.awt.font.ShapeGraphicAttribute;

public class ShapFactory {

    public Shape getShape(String shape){
        switch (shape){
            case "Rectangle":
                return new Rectangle();
            case "Circle":
                return new Circle();
            default:
                return null;
        }
    }
}
