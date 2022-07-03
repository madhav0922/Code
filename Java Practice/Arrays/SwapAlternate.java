package Arrays;

import java.util.*;

public class SwapAlternate {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        for (int i = 0; i < list.size(); i = i + 2) {
            int temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }

        System.out.println(list);
    }
}
