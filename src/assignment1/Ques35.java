package assignment1;

import java.util.Arrays;

public class Ques35 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] left = new int[arr.length/2];
        int[] right = new int[arr.length/2];
        for(int i = 0; i < left.length; i++) {
            left[i] = arr[i];
        }
        for(int i = 0; i < right.length; i++) {
            right[i] = arr[arr.length/2 + i];
        }
        int[] rotated = new int[left.length + right.length];
        int i = 0;
        int j = rotated.length / 2;
        for(int n : right) {
            rotated[i] = n;
            i++;
        }
        for(int n : left) {
            rotated[j] = n;
            j++;
        }
        System.out.println(Arrays.toString(rotated));
    }
}
