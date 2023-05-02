package Design_Principles.SOLID;

/*
 * L -> Liskor Substitution Principle
 * SubType must be substituable for their BaseType
 * In simple words, Child should be substitutable for their Parent
 * Bina wajah inheritance nahii karni.
 */

abstract class Square {
    public static void calculateArea() {

    }
}

final class Rectangle extends Square {
    public static void calculateArea() {
        // Now just send the length and breadth as different.
        // NO.
        // Wrong inheritance because the code is not extensible.
        // Lets say we introduce a new shape to calculate the area it'd not work.
    }
}

// Correction ->

abstract class Shape {
    abstract public void calculateArea();
}

final class RectangleNew extends Shape {
    @Override
    public void calculateArea() {
        // Definition to calculate area of rectangle
    }
}

final class SquareNew extends Shape {
    @Override
    public void calculateArea() {
        // Definition to calculate area of square
    }
}

public class SolidKaL {
    public static void main(String[] args) {

    }
}
