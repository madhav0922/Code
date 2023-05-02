package Structural_Design_Patterns.Decorator_Pattern.CarImplementation;

import Structural_Design_Patterns.Decorator_Pattern.CarInterface.Car;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.println("Basic car");
    }

}
