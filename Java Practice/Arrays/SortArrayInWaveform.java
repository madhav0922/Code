package Arrays;

import java.util.*;

public class SortArrayInWaveform {
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = { 11, 6, 7, 4, 3, 22, 80, 70 };

        for (int i = 0; i < a.length; i += 2) {
            if (i > 0 && a[i - 1] > a[i]) {
                swap(a, i, i - 1);
            }

            if (i < a.length - 1 && a[i] < a[i + 1]) {
                swap(a, i, i + 1);
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
