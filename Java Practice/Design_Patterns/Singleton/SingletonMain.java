package Singleton;

import java.io.Serializable;

final class Singleton implements Serializable {

    private static Singleton object;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (object == null) {
            synchronized (Singleton.class) {
                if (object == null)
                    object = new Singleton();
            }
        }
        return object;
    }

    public void print() {
        System.out.println("print called\n");
    }
    /*
     * NEW KEYWORD HERE WOULD OBVIOUSLY WORK EVEN IF THE OBJECT IS PRIVATE BECAUSE
     * WE ARE IN THE SAME CLASS.
     * 
     * public static void main(String[] args) {
     * Singleton s = Singleton.getInstance();
     * Singleton s1 = Singleton.getInstance();
     * // Singleton s2 = new Singleton(); -- The constructor Singleton() is not
     * // visible.
     * // s2.print();
     * System.out.println(s.equals(s1));
     * // System.out.println(s.equals(s2));
     * }
     */

}

public class SingletonMain {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();

        // The constructor Singleton() is not visible.
        // Singleton s2 = new Singleton();
        // s2.print();
        // System.out.println(s.equals(s2));

        System.out.println(s.equals(s1));

    }
}