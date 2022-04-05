package Arrays;

import java.util.*;

public class MergeTwoSortedArray {
    static void mergeTwoSortedArray(List<Integer> list1, List<Integer> list2) {
        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                list.add(list1.get(i));
                i++;
            } else {
                list.add(list2.get(j));
                j++;
            }
        }
        while (i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }
        while (j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 10, 20, 50));
        List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10, 12, 14, 20, 22, 27, 30, 50));
        mergeTwoSortedArray(list1, list2);
    }
}
