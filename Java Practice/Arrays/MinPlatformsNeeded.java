package Arrays;

import java.util.*;

public class MinPlatformsNeeded {

    public static void solution(List<Integer> arr, List<Integer> dep) {
        int count = 1, result = 1;
        int i = 1, j = 0;
        Collections.sort(arr);
        Collections.sort(dep);
        while (i < arr.size() && j < dep.size()) {
            if (arr.get(i) <= dep.get(j)) {
                count++;
                i++;
            } else if (arr.get(i) > dep.get(j)) {
                count--;
                j++;
            }
            if (count > result)
                result = count;
        }
        System.out.println("Min Needed Platforms " + result);
    }

    public static void main(String[] args) {
        // Scanner myObj = new Scanner(System.in);
        // int m = myObj.nextInt();
        // int n = myObj.nextInt();
        List<Integer> arr = new ArrayList<>(Arrays.asList(900, 940, 950, 1100, 1500, 1800));
        List<Integer> dep = new ArrayList<>(Arrays.asList(910, 1200, 1120, 1130, 1900, 2000));
        // for (int i = 0; i < m; i++) {
        // arr.add(myObj.nextInt());
        // }
        // for (int i = 0; i < m; i++) {
        // dep.add(myObj.nextInt());
        // }
        solution(arr, dep);
    }
}
