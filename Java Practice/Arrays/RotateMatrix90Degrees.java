package Arrays;

import java.util.*;

public class RotateMatrix90Degrees {

    static void rotateMatrix90Degreesleft(List<List<Integer>> listOflists) {
        int n = listOflists.size();
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = listOflists.get(i).get(j);
                listOflists.get(i).set(j, listOflists.get(j).get(n - 1 - i));
                listOflists.get(j).set(n - 1 - i, listOflists.get(n - 1 - i).get(n - 1 - j));
                listOflists.get(n - 1 - i).set(n - 1 - j, listOflists.get(n - 1 - j).get(i));
                listOflists.get(n - 1 - j).set(i, temp);
            }
        }
        System.out.println(listOflists);
    }

    static void rotateMatrix90DegreesRight(List<List<Integer>> listOflists) {
        int m = listOflists.size(), n = listOflists.get(0).size();

        // for(int i = 0 ; i <= row/2 ; i++) {
        // for(int j = i; j < col - i ; j++) {
        // int temp = matrix[i][j];
        // matrix[i][j] = matrix[row-j][i];
        // matrix[row-j][i] = matrix[row-i][col-j];
        // matrix[row-i][col-j] = matrix[j][row-i];
        // matrix[j][row-i] = temp;
        // }
        // }

        for (int i = 0; i < m / 2; i++) {
            for (int j = i; j < n - 1 - i; j++) {
                int temp = listOflists.get(i).get(j);
                listOflists.get(i).set(j, listOflists.get(n - 1 - j).get(i));
                listOflists.get(n - 1 - j).set(i, listOflists.get(m - 1 - i).get(n - 1 - j));
                listOflists.get(m - 1 - i).set(n - 1 - j, listOflists.get(j).get(n - 1 - i));
                listOflists.get(j).set(n - 1 - i, temp);
            }
        }
        System.out.println(listOflists);
    }

    public static void main(String[] args) {
        List<List<Integer>> listOflists = new ArrayList<>();
        listOflists.add(Arrays.asList(1, 2, 3, 4));
        listOflists.add(Arrays.asList(5, 6, 7, 8));
        listOflists.add(Arrays.asList(9, 10, 11, 12));
        listOflists.add(Arrays.asList(13, 14, 15, 16));
        rotateMatrix90Degreesleft(listOflists);
        rotateMatrix90DegreesRight(listOflists);
        rotateMatrix90DegreesRight(listOflists);
    }
}
