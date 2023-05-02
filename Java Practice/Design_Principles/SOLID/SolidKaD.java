package Design_Principles.SOLID;

/*
 * D -> Dependency Inversion
 * Depend on Abstraction (Interface) and not on concrete classes.
 * Apne se responsibility hata ke dusre pe daaldo
 */

interface Reader {
    public char read();
}

interface Writer {
    public void write(char ch);
}

class Keyboard implements Reader {
    @Override
    public char read() {
        // Keyboard read implementation
        return 'k';
    }
}

class Mouse implements Reader {
    @Override
    public char read() {
        // Keyboard read implementation
        return 'm';
    }
}

class Printer implements Writer {
    @Override
    public void write(char ch) {
        // Printer write implementation
        System.out.println(ch);
    }
}

class Monitor implements Writer {
    @Override
    public void write(char ch) {
        // Printer write implementation
        System.out.println("Monitor " + ch);
    }
}

class Copy {
    /*
     * Problem as copy method is dependent on ReadKeyboard and Write to o/p device
     * objects
     */

    /*
     * public static void copy(String device) {
     * Reader r = new Reader();
     * if((ch = ReadKeyboard()) != eof) {
     * if(device == "Printer") {
     * writePrinter();
     * } else {
     * writeDisk();
     * }
     * }
     * }
     */

    /*
     * Solution -> Dependency Inversion
     */

    public static void copy(Reader reader, Writer writer) {
        char ch;
        int i = 0;
        while ((ch = reader.read()) != ' ' && i++ < 5) {
            writer.write(ch);
        }
        // Now the dependency is not on copy method but on reader and writer method to
        // use the device they want.
    }

}

public class SolidKaD {
    public static void main(String[] args) {
        Copy.copy(new Keyboard(), new Printer());
        Copy.copy(new Mouse(), new Monitor());
    }
}
