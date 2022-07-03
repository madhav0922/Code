package Arrays;

import java.util.*;

public class FindUnique {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 2, 3, 4, 5));
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            num = num ^ list.get(i);
        }
        System.out.println(num);
    }

    public boolean findDuplicates(ArrayList<Integer> hashValues) {

        Collections.sort(hashValues);
        for (int i = 0; i < hashValues.size() - 1; i++) {
            if (hashValues.get(i + 1) == hashValues.get(i)) {
                return false;
            }
        }
        return true;
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashUnique = new HashMap<>();
        ArrayList<Integer> hashValues = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (hashUnique.containsKey(arr[i])) {
                hashUnique.put(arr[i], hashUnique.get(arr[i]) + 1);
            } else {
                hashUnique.put(arr[i], 1);
            }
        }
        hashValues = new ArrayList<Integer>(hashUnique.values());

        return findDuplicates(hashValues);

    }
}
