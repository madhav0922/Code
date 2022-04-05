// Leader is an element greater than all the elements to its right
// 16, 17, 4, 17, 3, 5, 2
// o/p -> 17, 5, 2 sequence does not matter.

package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeadersInArray {

    static void bruteforce(List<Integer> list) {
        int flag, temp;
        for (int i = 0; i < list.size(); i++) {
            flag = 1;
            temp = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) > temp) {
                    // i not a leader anymore
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(temp + " is a leader");
            }
        }
    }

    static void goInReverseDude(List<Integer> list) {
        int max = list.get(list.size() - 1);
        System.out.println(max + " is a leader");
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) > max) {
                max = list.get(i);
                System.out.println(max + " is a leader");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(16, 17, 4, 17, 3, 5, 2));
        // bruteforce(list);
        goInReverseDude(list);
    }
}
