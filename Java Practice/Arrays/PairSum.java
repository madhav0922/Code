package Arrays;

import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, -3, 3, 3, -2));
        Collections.sort(list);
        int i = 0, j = list.size() - 1, sumToMake = 0;
        // 1,2,3,4,5,7
        while (i < j) {
            if (list.get(i) + list.get(j) == sumToMake) {
                System.out.println(list.get(i) + "," + list.get(j));
                i++;
                j--;
            }
            if (list.get(i) + list.get(j) < sumToMake)
                i++;
            if (list.get(i) + list.get(j) > sumToMake)
                j--;
        }
    }
}
