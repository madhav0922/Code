package Structural_Design_Patterns.Facade_Pattern.Facade;

import Structural_Design_Patterns.Facade_Pattern.StoreImplementation.Mobiles.Apple;
import Structural_Design_Patterns.Facade_Pattern.StoreImplementation.Mobiles.Samsung;

/*
 * This class is a facade, it helps client interact easily to the whole environment rather than dealing 
 * with individual and a complex multiple class structure
 */
public class ShopKeeper {

    public void iPhoneSale() {
        Apple apple = new Apple();
        apple.modelNo();
        apple.screenSize();
    }

    public void samsungSale() {
        Samsung samsung = new Samsung();
        samsung.modelNo();
        samsung.screenSize();
    }
}
