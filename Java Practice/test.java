import java.util.ArrayList;
import java.util.Scanner;

class Test {
    static void computeAndFormat(ArrayList<Integer> primes) {
        String output = "";
        for (int i = 1; i < primes.size(); i++)
            if (primes.get(i) - primes.get(i - 1) == 2) {
                output = output + primes.get(i - 1) + ":" + primes.get(i) + ",";
            }
        output = output.substring(0, output.length() - 1);
        System.out.println(output);
    }

    static boolean isPrime(int i) {
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // find prime in range
        ArrayList<Integer> primes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Integer m, n;
        System.out.println("Enter the lower limit");
        m = sc.nextInt();
        System.out.println("Enter the upper limit");
        n = sc.nextInt();
        sc.close();
        for (int i = m; i < n; i++) {
            // check if prime
            if (isPrime(i))
                primes.add(i);
        }
        // format output
        computeAndFormat(primes);
    }
}