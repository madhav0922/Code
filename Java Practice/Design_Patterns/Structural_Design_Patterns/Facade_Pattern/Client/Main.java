package Structural_Design_Patterns.Facade_Pattern.Client;

import java.util.Scanner;

import Structural_Design_Patterns.Facade_Pattern.Facade.ShopKeeper;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose 1. Apple, 2. Samsung");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.close();

        ShopKeeper shopKeeper = new ShopKeeper();

        switch (choice) {
            case 1:
                shopKeeper.iPhoneSale();
                break;
            case 2:
                shopKeeper.samsungSale();
                break;
            default:
                System.out.println("No sale");
        }
    }
}
