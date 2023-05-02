package Structural_Design_Patterns.Decorator_Pattern.ConcreteDecorators;

import Structural_Design_Patterns.Decorator_Pattern.CarInterface.Car;
import Structural_Design_Patterns.Decorator_Pattern.Decorator.CarDecorator;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding features of Sports Car");
    }
}
