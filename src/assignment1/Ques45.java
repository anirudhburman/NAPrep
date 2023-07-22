package assignment1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ques45 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        Collections.shuffle(intList);
        System.out.println(intList);
    }
}
