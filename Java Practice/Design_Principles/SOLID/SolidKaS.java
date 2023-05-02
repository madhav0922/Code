package Design_Principles.SOLID;

/* S -> Single Responsiblity Principle
    *Every entity should have a single responsibility 
*/

final class Read {
    public static void readKeyboard() {

    }

    public static void writeKeyboard() {
        // wrong implementation because now class has two responsibilities and it would
        // make code non-extensible
    }
}

public class SolidKaS {
    // Every entity should have a single responsibility
    int countLength;

    public static void main(String[] args) {

    }
}
