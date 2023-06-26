package Creational_Design_Patterns.Factory_Pattern2.Factory;

import java.util.Scanner;

import Creational_Design_Patterns.Factory_Pattern2.Product.Shape;

public class ShapeFactoryDemo {

    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();

        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        sc.close();

        Shape shapeObject = sf.getShape(shape);
        shapeObject.draw();
    }

}
