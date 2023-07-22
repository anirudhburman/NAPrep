package assignment1;

import java.util.Arrays;

public class Ques24 {
    public static void main(String[] args) {
        int[] arr = {948,99,327,831,132,198};
        System.out.println("Evens: " + Arrays.toString(Arrays.stream(arr).filter(n -> n % 2 == 0).toArray()));
        System.out.println("Odds: " + Arrays.toString(Arrays.stream(arr).filter(n -> n % 2 != 0).toArray()));
    }
}
