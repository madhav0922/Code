package Arrays;

import java.util.*;

class Amazon2 {
    public static int solution(List<Integer> parcels, int k) {
        int totalAllowedParcels = k - parcels.size(),
                sum = 0,
                totalAddedParcels = 0;
        boolean flag = false;
        if (totalAllowedParcels < 1) {
            return 0;
        }
        int temp = parcels.get(0);
        int l = 0;
        if (temp != 1) {
            for (int i = 1; i < temp; i++) {
                parcels.add(l++, i);
                totalAddedParcels++;
                sum = sum + i;
                if (totalAddedParcels == totalAllowedParcels) {
                    flag = true;
                    break;
                }
            }
            // System.out.println("sum " + sum);
        }
        // System.out.println(totalAddedParcels);
        // System.out.println(parcels);
        if (!flag) {
            for (int i = 1; i < parcels.size(); i++) {
                // System.out.println(parcels);
                if (parcels.get(i - 1) + 1 != parcels.get(i)) {
                    temp = parcels.get(i);
                    int j = i;
                    for (int addNum = parcels.get(i - 1) + 1; addNum < temp; addNum++) {
                        sum = sum + addNum;
                        parcels.add(j++, addNum);
                        totalAddedParcels++;
                        if (totalAddedParcels == totalAllowedParcels) {
                            flag = true;
                            break;
                        }
                        // System.out.println("totalAdded " + totalAddedParcels);
                    }
                    // System.out.println("summ " + sum);
                }
                if (flag) {
                    break;
                }
            }
        }
        // System.out.println(parcels);
        // System.out.println(sum);
        return sum;
    }

    public static int solution2WithSetLike(List<Integer> parcels, int k) {
        int totalAllowedParcels = k - parcels.size();
        int totalAddedParcels = 0;
        int sum = 0;
        int nonIterations = 0;
        for (int i = 1; i < parcels.size() + nonIterations; i++) {
            if (!parcels.contains(i)) {
                parcels.add(i);
                totalAddedParcels++;
                if (totalAddedParcels == totalAllowedParcels) {
                    break;
                }
            } else
                nonIterations++;
            System.out.println("size " + parcels.size());
        }
        System.out.println(parcels);
        for (int j = k - totalAllowedParcels; j < parcels.size(); j++) {
            sum = sum + parcels.get(j);
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> parcels = new ArrayList<>(Arrays.asList(2, 3, 6, 10, 11)); // 1,4,5,7,8,9
        int k = 15;
        // System.out.println("Minimum cost = " + solution(parcels, k));
        System.out.println("Minimum cost = " + solution2WithSetLike(parcels, k));
    }
}