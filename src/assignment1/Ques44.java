package assignment1;

import java.util.Arrays;

public class Ques44 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,4};
        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Equal");
        } else {
            System.out.println("Unequal");
        }
    }
}
