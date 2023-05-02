package Structural_Design_Patterns.Decorator_Pattern;

import Structural_Design_Patterns.Decorator_Pattern.CarImplementation.BasicCar;
import Structural_Design_Patterns.Decorator_Pattern.CarInterface.Car;
import Structural_Design_Patterns.Decorator_Pattern.ConcreteDecorators.LuxuryCar;
import Structural_Design_Patterns.Decorator_Pattern.ConcreteDecorators.SportsCar;

public class Main {
    public static void main(String[] args) {
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();

        System.out.println("\n*****");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }

}
