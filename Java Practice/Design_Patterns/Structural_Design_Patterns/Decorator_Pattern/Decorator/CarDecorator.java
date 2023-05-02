package Structural_Design_Patterns.Decorator_Pattern.Decorator;

import Structural_Design_Patterns.Decorator_Pattern.CarInterface.Car;

public class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }

}
