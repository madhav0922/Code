package Two_Pointers;

import java.util.*;

public class Max0ToFlip {
    public static void max0ToFlip(List<Integer> list, int m) {
        int p1 = 0, p2 = 1, last_po1 = 0, n = m;
        int count = 0, maxCount = -1;
        boolean flag = false;

        while (p2 < list.size()) {
            // System.out.println("p2 " + list.get(p2));
            // System.out.println("cond " + (list.get(p2) == 1) + p2);
            if ((list.get(p2) == 1) && (list.get(p2 - 1) == 0) && n == 0) {
                last_po1 = p2;
            }
            // System.out.println("cond " + (list.get(p2 - 1) == 0 && n == 0) + p2 + " " +
            // n);
            if (list.get(p2) == 1) {
                if (n == 0) {
                    flag = true;
                }
                count++;
            }
            if (list.get(p2) == 0 && n > 0) {
                count++;
                n = n - 1;
                // System.out.println("nnnnn " + n);
            }
            if (list.get(p2) == 0 && n == 0 && flag == true) {
                // System.out.println("Hello");
                n = m - 1;
                p1 = last_po1;
                count = 0;
                flag = false;
                while (p1 != p2 + 1) {
                    count++;
                    p1++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
            }
            ++p2;
            // System.out.println("n = " + n);
            // System.out.println("p2 " + p2);

        }
        System.out.println(maxCount + 1);
        System.out.println((last_po1 - maxCount - 1) + " to " + (last_po1 - 1));
    }

    public static void max0ToFlipSlidingWindow(List<Integer> list, int m) {
        int l = 0, r = 0, bestLeft = 0, bestWindow = 0, zeroCount = 1;

        while (r < list.size()) {
            if (zeroCount <= m) {
                if (list.get(r) == 0) {
                    zeroCount++;
                }
                r++;
            }
            if (zeroCount > m) {
                if (list.get(l) == 0) {
                    zeroCount--;
                }
                l++;
            }
            if ((r - l > bestWindow) && (zeroCount <= m)) {
                bestWindow = r - l;
                bestLeft = l;
            }
            // r++;
        }
        System.out.println("best window length " + (bestWindow));
        System.out.println("Best Window from " + (bestLeft + 1) + " To " + (bestLeft + bestWindow) + "\n");

        // Zeros to replace at index
        System.out.print("Replace zeroes at index - ");
        for (int i = 0; i < bestWindow; i++) {
            if (list.get(bestLeft + i) == 0) {
                System.out.print(i);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 1, 1, 0, 1, 0,
                1, 1, 1, 1, 0, 1, 0));

        // List<Integer> list = new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1, 0, 1, 0, 1,
        // 1, 1, 1));

        // max0ToFlip(list, 2);
        max0ToFlipSlidingWindow(list, 2);
    }
}
