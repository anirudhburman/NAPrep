package assignment1;

import java.util.stream.Collectors;

public class Ques5 {
    public static void main(String[] args) {
        String str = "kurkure";
        System.out.println(str.chars().mapToObj(c -> String.valueOf((char)c)).distinct().collect(Collectors.joining(",")));
    }
}
