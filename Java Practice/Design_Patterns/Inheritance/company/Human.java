package Inheritance.company;

public class Human extends SuperHuman {
    void printHuman() {
        Human h1 = new Human();
        h1.age = 100;
        h1.weight = 80;

        // use of extend to access the data members of human in super human
        // -- both are in same package
        SuperHuman sh1 = new SuperHuman();
        sh1.age = 1000;
        sh1.weight = 200;
    }
}