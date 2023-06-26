package Creational_Design_Patterns.Factory_Pattern2.Factory;

import Creational_Design_Patterns.Factory_Pattern2.Product.Circle;
import Creational_Design_Patterns.Factory_Pattern2.Product.Rectangle;
import Creational_Design_Patterns.Factory_Pattern2.Product.Shape;
import Creational_Design_Patterns.Factory_Pattern2.Product.Square;

public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        } else // dont use else, otherwise for all other shapes it would be called
            return new Circle();
    }
}