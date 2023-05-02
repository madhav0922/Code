package Inheritance.gender;

import Inheritance.company.Human;

public class Male extends Human {
    void print() {

    }

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age = 10;

        // ****
        // h1.weight = 20;
        // weight is not visible since it is protected. Therefore we
        // need to extend class and access it via Male class object

        Male m1 = new Male();
        m1.age = 100;

        // ****
        m1.weight = 20; // Able to access protected as we are in a different package with inherited
                        // sub-class
        System.out.println(h1.age + " " + m1.age + " " + m1.weight);
    }

}
