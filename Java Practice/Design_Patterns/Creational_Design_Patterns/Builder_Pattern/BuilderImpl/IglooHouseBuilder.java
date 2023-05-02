package Creational_Design_Patterns.Builder_Pattern.BuilderImpl;

import Creational_Design_Patterns.Builder_Pattern.Builder.HouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.Product.House;

public class IglooHouseBuilder implements HouseBuilder {
    final String houseType = "Igloo";

    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("Building " + houseType + " basement");
        this.house.setBasementType("Ice Bars");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building " + houseType + " structure");
        this.house.setStructureType("Ice Blocks");
    }

    @Override
    public void buildRoot() {
        System.out.println("Building " + houseType + " root");
        this.house.setRootType("Ice Carvings");
    }

    @Override
    public void buildInterior() {
        System.out.println("Building " + houseType + " interior");
        this.house.setInteriorType("Ice Dome");
    }

    @Override
    public House getHouse() {
        return house;
    }

    @Override
    public String getHouseType() {
        return houseType;
    }

}
