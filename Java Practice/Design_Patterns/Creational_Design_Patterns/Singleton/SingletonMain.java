package Creational_Design_Patterns.Singleton;

import java.io.Serializable;

/*
 * Why use singleton?
 * Logger, db Connection
 */

final class Singleton implements Serializable {

    private static Singleton object;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // This is the best method, check object first
        if (object == null) {
            // Then check the thread as multiple threads could reach till this part
            synchronized (Singleton.class) {
                // Then check the object again
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

/*
 * public class SingletonMain {
 * public static void main(String[] args) {
 * Singleton s = Singleton.getInstance();
 * Singleton s1 = Singleton.getInstance();
 * 
 * // The constructor Singleton() is not visible.
 * // Singleton s2 = new Singleton();
 * // s2.print();
 * // System.out.println(s.equals(s2));
 * 
 * System.out.println(s.equals(s1));
 * 
 * }
 * }
 */
public class SingletonMain extends Thread {
    public static void main(String[] args) {
        // Singleton singleton = new Singleton(); // constructor not visible

        SingletonMain t1 = new SingletonMain();
        SingletonMain t2 = new SingletonMain();
        t1.start();
        t2.start();
    }

    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton2);
        System.out.println(singleton.equals(singleton2));
    }
}