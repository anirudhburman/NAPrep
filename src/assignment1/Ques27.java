package assignment1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ques27 {
    public static void main(String[] args) {
        int start = 23;
        int end = 201;
        System.out.println(Arrays.toString(IntStream.range(start, end).filter(Ques26::isPrime).toArray()));
    }
}
