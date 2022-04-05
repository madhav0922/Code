// 0, 0, 1, 1, 0, 2, 0, 1, 1, 2, 2, 0, 1
// 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2 

package Arrays;

import java.util.*;

public class Sort0s1s2s {
    static void swap(List<Integer> list, int index1, int index2) {
        int temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    static void sortSaid(List<Integer> list) {
        int low = 0, mid = 1, high = list.size() - 1;
        while (mid < high) {
            int n = list.get(mid);
            switch (n) {
                case 0:
                    if (list.get(low) > list.get(mid))
                        swap(list, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    if (list.get(mid) > list.get(high))
                        swap(list, mid, high);
                    high--;
                    break;
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 0, 0, 1, 1, 0, 2, 0, 1, 1, 2, 2, 0, 1));
        sortSaid(list);
    }
}
