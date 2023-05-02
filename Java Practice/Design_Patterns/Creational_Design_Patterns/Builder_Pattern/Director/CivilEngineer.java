package Creational_Design_Patterns.Builder_Pattern.Director;

import Creational_Design_Patterns.Builder_Pattern.Builder.HouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.Product.House;

public class CivilEngineer {
    HouseBuilder houseBuilder;

    public CivilEngineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        System.out.println(this.houseBuilder.getHouseType() + " under construction");
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoot();
        this.houseBuilder.buildInterior();
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }
}
