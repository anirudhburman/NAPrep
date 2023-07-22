package assignment1;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ques48 {
    public static void main(String[] args) {
        String s = "anirudh barman";
        Map<Character, Long> map = s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
