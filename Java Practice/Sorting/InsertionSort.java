package Sorting;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int arr[], int pos, int minIndex) {
        int temp = arr[pos];
        arr[pos] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 12, 10, 9, 30, 25 };

        // for (int i = 1; i < arr.length; i++) {
        // int currElement = i;
        // for (int j = i - 1; j >= 0; j--) {
        // if (arr[currElement] < arr[j]) {
        // swap(arr, currElement, j);
        // currElement = j;
        // }
        // }
        // }

        for (int i = 1; i < arr.length; i++) {
            int currElement = arr[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > currElement) {
                    arr[j + 1] = arr[j];
                } else {
                    // if we do not break j would always reach 0 which is not correct position
                    break;
                }
            }
            arr[j + 1] = currElement;
        }
        System.out.println(Arrays.toString(arr));
    }
}
