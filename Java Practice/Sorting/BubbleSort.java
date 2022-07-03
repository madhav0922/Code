package Sorting;

import java.util.Arrays;

public class BubbleSort {
    static void swap(int arr[], int pos, int minIndex) {
        int temp = arr[pos];
        arr[pos] = arr[minIndex];
        arr[minIndex] = temp;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 12, 10, 9, 30, 25 };
        Boolean swapped = false;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapped = true;
                    // System.out.println("swap");
                }
            }
            if (swapped == false) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
