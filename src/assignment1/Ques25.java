package assignment1;

import java.util.Arrays;

public class Ques25 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = merged.length / 2;
        for(int n : arr1) {
            merged[i] = n;
            i++;
        }
        for(int n : arr2) {
            merged[j] = n;
            j++;
        }
        System.out.println(Arrays.toString(merged));
    }
}
