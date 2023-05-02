package Creational_Design_Patterns.Builder_Pattern.BuilderImpl;

import Creational_Design_Patterns.Builder_Pattern.Builder.HouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.Product.House;

public class TreeHouseBuilder implements HouseBuilder {
    final String houseType = "Tree House";

    private House house;

    public TreeHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        System.out.println("Building " + houseType + " basement");
        this.house.setBasementType("Wooden Poles");
    }

    @Override
    public void buildStructure() {
        System.out.println("Building " + houseType + " structure");
        this.house.setStructureType("Wood");
    }

    @Override
    public void buildRoot() {
        System.out.println("Building " + houseType + " root");
        this.house.setRootType("Fire Wood");
    }

    @Override
    public void buildInterior() {
        System.out.println("Building " + houseType + " interior");
        this.house.setInteriorType("Wood and Carbon");
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
