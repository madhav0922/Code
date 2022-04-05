package Arrays;

public class Gcd {
    public static int findGcd(int a, int b) {
        if (b != 0) {
            findGcd(b, a % b);
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 90, b = 10;
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        int c = findGcd(a, b);
        System.out.println(c);
    }
}
