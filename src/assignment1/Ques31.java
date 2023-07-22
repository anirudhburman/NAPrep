package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Ques31 {
    public static void main(String[] args) {
        int start = 100;
        int end = 1000;
        System.out.println(Arrays.toString(IntStream.rangeClosed(start, end).filter(Ques31::isArmstrong).toArray()));
    }

    public static boolean isArmstrong(int num) {
        int copy = num;
        int sum = 0;
        int numDigits = String.valueOf(num).length();

        while(num > 0) {
            int digit = num % 10;
            sum += (int) Math.pow(digit, numDigits);
            num /= 10;
        }
        return sum == copy;
    }
}
