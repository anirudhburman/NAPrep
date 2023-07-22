package assignment1;

import java.util.Arrays;

public class Ques23b {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3,9,0};
//        int[] copy = Arrays.copyOf(arr, arr.length);
//        System.out.println(Arrays.equals(arr, copy));

        int[] copy = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        System.out.println(Arrays.toString(copy));
    }
}
