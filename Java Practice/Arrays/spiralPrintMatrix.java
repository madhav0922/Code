package Arrays;

import java.util.*;

public class spiralPrintMatrix {
    static void spiralPrint(List<List<Integer>> listOflists) {
        int top = 0, left = 0, right = listOflists.get(0).size() - 1, bottom = listOflists.size() - 1;
        System.out.println(left + "" + right + bottom + top);
        while (top <= bottom) {
            for (int i = left; i <= right; i++)
                System.out.println(listOflists.get(top).get(i));
            top++;
            for (int i = top; i <= bottom; i++)
                System.out.println(listOflists.get(i).get(right));
            right--;
            for (int i = right; i >= left; i--)
                System.out.println(listOflists.get(bottom).get(i));
            bottom--;
            for (int i = bottom; i >= top; i--)
                System.out.println(listOflists.get(i).get(left));
            left++;
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> listOflists = new ArrayList<>();
        listOflists.add(Arrays.asList(1, 2, 3, 4));
        listOflists.add(Arrays.asList(5, 6, 7, 8));
        listOflists.add(Arrays.asList(9, 10, 11, 12));
        listOflists.add(Arrays.asList(13, 14, 15, 16));
        spiralPrint(listOflists);
    }
}
