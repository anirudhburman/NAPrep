package assignment1;

import java.util.Arrays;

public class Ques39 {
    public static void main(String[] args) {
        String str = "hello my name is anirudh";
        String[] arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(
                    s.chars().mapToObj(c -> (char) c).findFirst().map(Character::toUpperCase).get()
            ).append(
                    s.chars().mapToObj(c -> (char) c)
                            .skip(1)
                            .filter(c -> c != s.charAt(s.length() - 1))
                            .reduce("", (a,b) -> a + b, (a1, b1) -> a1 + b1)
            ).append(
                    Character.toUpperCase(s.charAt(s.length() - 1))
            ).append(" ");
        }
        System.out.println(sb);
    }
}
