package assignment1;

import java.util.Arrays;

public class Ques40 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2,1,7,8,9,6};
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        int [] pair = new int[]{first, second};
        System.out.println(Arrays.toString(pair));
    }
}
