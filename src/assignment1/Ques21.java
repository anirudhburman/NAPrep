package assignment1;

import java.util.Arrays;

public class Ques21 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,4,2,1,6,7,5,0};
        System.out.println(Arrays.toString(Arrays.stream(arr).distinct().toArray()));
    }
}
