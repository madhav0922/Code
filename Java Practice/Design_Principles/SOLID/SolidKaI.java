package Design_Principles.SOLID;

/*
 * I -> Interface Seggregation Principle
 * Interfaces ko zabardasti thopna nahii hai where not required.
 * eg: Credit Card
 */

abstract interface Animal {
    abstract public void feed();

    abstract public void pet();
}

final class Dog implements Animal {
    public void feed() {

    }

    public void pet() {

    }
}

final class Lion implements Animal {
    public void feed() {

    }

    public void pet() {
        // Really...................... Therefore Interface should be segregated.
    }
}

// Solution ->

/*
 * This is to be explored.. not complete yet
 * abstract non-sealed interface Feedable {
 * 
 * }
 * 
 * abstract interface Pettable {
 * 
 * }
 * 
 * sealed interface Animal2 permits Feedable, Pettable {
 * 
 * }
 */

interface Pettable {

}

interface Feedable {

}

class Dog2 implements Pettable, Feedable {

}

class Lion2 implements Feedable {
    // Therefore interfaces are now segregated
}

public class SolidKaI {
    public static void main(String[] args) {

    }
}
