package Creational_Design_Patterns.Builder_Pattern.Builder;

import Creational_Design_Patterns.Builder_Pattern.Product.House;

public interface HouseBuilder {
    // HouseBuilder hai.. matlab structure banake kya return karegi? House.

    // Building...
    public void buildBasement();

    public void buildStructure();

    public void buildRoot();

    public void buildInterior();

    // returns the formed product -> House
    public House getHouse();

    public String getHouseType();
}
