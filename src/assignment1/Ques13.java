package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques13 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "Silent";

        char[] arr1 = s1.toLowerCase().toCharArray();
        char[] arr2 = s2.toLowerCase().toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
     }
}
