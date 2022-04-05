package Arrays;

import java.util.*;

public class PartitionPointInArray {
    public static void main(String[] args) {
        int[] a = { 1, 1, 5, 4, 3, 6, 9, 9, 9, 7, 8, 10 }, GEL = a.clone(); // SER = a.clone();
        for (int i = 1; i < GEL.length; i++) {
            if (GEL[i] < GEL[i - 1]) {
                GEL[i] = GEL[i - 1];
            }
        }
        // for (int i = SER.length - 2; i >= 0; i--) {
        // if (SER[i] > SER[i + 1]) {
        // SER[i] = SER[i + 1];
        // }
        // }

        for (int i = 1; i < a.length; i++) {
            if ((i == 1 && GEL[i - 1] < a[i])) {
                System.out.println("Partition point = " + GEL[i - 1]);
            }
            if ((i == a.length - 1 && GEL[i - 1] < a[i])
                    || GEL[i - 1] < a[i] && a[i] < GEL[i + 1]) {
                System.out.println("Partition point = " + a[i]);
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(GEL));
        // System.out.println(Arrays.toString(SER));
    }
}
