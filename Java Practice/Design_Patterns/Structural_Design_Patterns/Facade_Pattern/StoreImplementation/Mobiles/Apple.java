package Structural_Design_Patterns.Facade_Pattern.StoreImplementation.Mobiles;

import Structural_Design_Patterns.Facade_Pattern.StoreImplementation.MobileStore.MobileShop;

public class Apple implements MobileShop {

    @Override
    public void modelNo() {
        System.out.println("iPhone X");
    }

    @Override
    public void screenSize() {
        System.out.println("5.5 inch");
    }

}
