package Inheritance.gender;

import Inheritance.company.Human;

public class Female extends Human {
    void print() {

    }

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age = 10;

        // ****
        // h1.weight = 20; // weight is not visible since it is protected. Therefore we
        // need to extend class and access it via Male class object

        Female f1 = new Female();
        f1.age = 100;

        // ****
        f1.weight = 20; // Able to access protected as we are in a different package with inherited
                        // sub-class

        // ****
        // m1.height = 5;
        // Not visible since, default access modifier is being used
        // and we are in a different package

        System.out.println(h1.age + " " + f1.age + " " + f1.weight);
    }

}
