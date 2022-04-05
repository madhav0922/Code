package Arrays;

import java.util.Arrays;

public class SeiveAlgo {
    public static void main(String[] args) {
        int n = 40;
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[1] = false;

        for (int i = 2; i < Math.sqrt(n); i++) {
            if (prime[i] == true) {
                for (int j = i * i; j < n; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        // System.out.println(Arrays.toString(prime));
        for (int i = 1; i < n; i++) {
            if (prime[i])
                System.out.println(i);
        }
    }
}
