package assignment1;

import java.util.Arrays;

public class Ques34 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println("No of Evens : " + Arrays.stream(arr).filter(n -> n % 2 == 0).count());
        System.out.println("No of Odds : " + Arrays.stream(arr).filter(n -> n % 2 != 0).count());
    }
}
