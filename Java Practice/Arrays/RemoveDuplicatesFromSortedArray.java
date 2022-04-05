package Arrays;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    static List<Integer> removedup(List<Integer> list) {
        if (list.size() == 1)
            return list;

        List<Integer> listWithoutDup = new ArrayList<>();
        int i = 0, j = 1;
        // Manual input 1st element
        listWithoutDup.add(list.get(0));
        // Add others
        while (i < list.size() && j < list.size()) {
            if (list.get(j) == list.get(i)) {
                j++;
            } else {
                listWithoutDup.add(list.get(j));
                i = j;
                j = i + 1;
            }
        }
        return listWithoutDup;
    }

    static List<Integer> removeDupWithoutExtraSpace(List<Integer> list) {
        int i = 1;
        if (list.size() > 1) {
            while (i < list.size()) {
                if (list.get(i - 1) == list.get(i)) {
                    list.remove(list.get(i));
                } else {
                    i++;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 5, 5));
        List<Integer> listWoDup = new ArrayList<>();
        // if (!list.isEmpty())
        // listWoDup = removedup(list);
        if (!list.isEmpty())
            listWoDup = removeDupWithoutExtraSpace(list);
        System.out.println(listWoDup);
    }
}
