package assignment1;

public class Ques7 {
    public static void main(String[] args) {
        String str = "madam";
        char ch = 'a';
        System.out.println(str.chars().mapToObj(c -> (char)c).filter(c -> c == ch).count());
    }
}
