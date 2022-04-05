// 2, 62, -12, 72, -78, 83
// -78, -12, 2, 62, 72, 83
// o/p -> -78 and 83 

package Arrays;

import java.util.*;

public class FindElementClosestTo0 {
    static void findSumOfPairclosestTo0(List<Integer> list) {
        Collections.sort(list);
        int i = 0, j = list.size() - 1, min_sum = Integer.MAX_VALUE, sum, min_l = 0, min_r = 0, l, r;
        while (i < j) {
            l = list.get(i);
            r = list.get(j);
            sum = l + r;
            if (Math.abs(sum) < Math.abs(min_sum)) {
                min_sum = sum;
                min_l = l;
                min_r = r;
            }
            if (sum < 0)
                i++;
            else
                j--;
        }
        System.out.println(min_l + " and " + min_r);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(2, 62, -12, 72, -78, 83));
        findSumOfPairclosestTo0(list);
    }
}
