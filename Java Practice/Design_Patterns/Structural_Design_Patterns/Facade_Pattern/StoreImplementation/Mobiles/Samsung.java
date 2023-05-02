package Structural_Design_Patterns.Facade_Pattern.StoreImplementation.Mobiles;

import Structural_Design_Patterns.Facade_Pattern.StoreImplementation.MobileStore.MobileShop;

public class Samsung implements MobileShop {
    @Override
    public void modelNo() {
        System.out.println("S22 Ultra");
    }

    @Override
    public void screenSize() {
        System.out.println("6.8 inch");
    }

}
