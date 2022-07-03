package Sorting;

import java.util.Arrays;

public class SelectionSort {

    static int findMinIndex(int arr[], int startIndex) {
        int min = Integer.MAX_VALUE, i, minIndex = 0;
        for (i = startIndex; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int arr[], int pos, int minIndex) {
        int temp = arr[pos];
        arr[pos] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 12, 10, 9, 30, 25 };

        // for (int i = 0; i < arr.length - 1; i++) {
        // int minIndex = findMinIndex(arr, i);
        // swap(arr, i, minIndex);
        // }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }

        System.out.println(Arrays.toString(arr));
    }

}
