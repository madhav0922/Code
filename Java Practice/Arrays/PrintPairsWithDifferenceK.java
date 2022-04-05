// 1,2,3,4,5,6,10,11,13,16,20,22 Print pairs with difference
// K = 10, in sorted or non sorted array mein bhi ho sakta hai

package Arrays;

import java.util.*;

class PrintPairsWithDifferenceK {
    static void pairsWithDiffK(List<Integer> list, int diff) {
        int i = 0, j = 1;
        while (i < list.size() && j < list.size()) {
            if (i != j && list.get(j) - list.get(i) == diff) {
                System.out.println(list.get(j) + "," + list.get(i));
                i++;
                j++;
            } else if (list.get(j) - list.get(i) < diff) {
                j++;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 10, 11, 13, 16, 20, 22));
        int diff = 10;
        pairsWithDiffK(list, diff);
    }
}