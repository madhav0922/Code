// Replace Next Greatest
// 16, 17, 4, 3, 5, 2
// 17 5 5 5 2 -1

package Arrays;

import java.util.*;

public class ReplaceNextGreatest {
    static void replaceNextGr(List<Integer> list) {
        int max = -1;
        for (int i = list.size() - 1; i > 0; i--) {
            int temp = max;
            if (max < list.get(i)) {
                max = list.get(i);
            }
            list.set(i, temp);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(16, 17, 4, 3, 5, 2));
        replaceNextGr(list);
    }
}
