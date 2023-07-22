package assignment1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ques15 {
    public static void main(String[] args) {
        String num = "28156437";
        int[] arr = num.chars().mapToObj(c -> String.valueOf((char)c)).map(Integer::parseInt).mapToInt(i -> i).toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining()));
//        System.out.println(Arrays.toString(arr));
    }
}
