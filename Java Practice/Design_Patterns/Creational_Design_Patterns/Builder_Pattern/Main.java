package Creational_Design_Patterns.Builder_Pattern;

import Creational_Design_Patterns.Builder_Pattern.Builder.HouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.BuilderImpl.IglooHouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.BuilderImpl.TreeHouseBuilder;
import Creational_Design_Patterns.Builder_Pattern.Director.CivilEngineer;
import Creational_Design_Patterns.Builder_Pattern.Product.House;

public class Main {
    public static void main(String[] args) {
        HouseBuilder house = new TreeHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(house);

        engineer.constructHouse();
        House readyHouse = engineer.getHouse();
        System.out.println(readyHouse.getHouseInfo());

        HouseBuilder house2 = new IglooHouseBuilder();
        CivilEngineer engineer2 = new CivilEngineer(house2);

        engineer2.constructHouse();
        House readyHouse2 = engineer2.getHouse();
        System.out.println(readyHouse2.getHouseInfo());
    }
}
