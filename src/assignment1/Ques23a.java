package assignment1;

import java.util.Arrays;

public class Ques23a {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 1, 0 };
        int[] sorted = bubbleSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
