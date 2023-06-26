package Design_Principles.SOLID;

// O -> Open-Closed Principle
/* 
    *Code should be open for extension and closed for modiication 
*/

final class ShapeOld {
    public static void calculateArea(Object[] shapes) {
        // double area = 0;
        for (Object shape : shapes) {
            if (shape == RectangleNew.class) {
                // area = area of rectangle function
            } else {
                // area = square area
            }
            /*
             * And now to implement another area class we would have to change this method.
             */
        }
    }
}

/*
 * Correction -> Either via abstract class or interfaces
 * Or maybe through function overloading as well but that wont save us from
 * change in the class. Therefore, not a good idea.
 */

abstract class Shape {
    abstract public void calculateArea();
}

final class RectangleNew extends Shape {
    @Override
    public void calculateArea() {
        // Definition to calculate area of rectangle
    }
}

final class SquureNew extends Shape {
    @Override
    public void calculateArea() {
        // Definition to calculate area of square
    }
}

public class SolidKaO {
    public static void main(String[] args) {

    }
}
