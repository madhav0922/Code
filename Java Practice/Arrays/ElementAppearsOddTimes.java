// 1231233 odd no. of times waala nikalo

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ElementAppearsOddTimes {

    static void bruteforce(List<Integer> list) {
        int count;
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            count = 0;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == temp)
                    count++;
            }
            if (count % 2 != 0) {
                System.out.println(temp + " occurs odd no. of times");
            }
        }
    }

    static void sortAndConquer(List<Integer> list) {
        Collections.sort(list);
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size() && list.get(i + 1) == list.get(i)) {
                count++;
            } else if (count % 2 != 0) {
                System.out.println(list.get(i) + " occurs odd no of times");
            } else {
                count = 1;
            }
        }
    }

    static void xOR(List<Integer> list) {
        int x = 0;
        for (int i = 0; i < list.size(); i++) {
            x = x ^ list.get(i);
        }
        System.out.println(x + " occurs odd no. of times");
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 1, 2, 3, 1, 2, 3, 3));
        // bruteforce(list);
        sortAndConquer(list);
        // xOR(list);
    }
}
