package assignment1;

public class Ques18 {
    public static void main(String[] args) {
        String s1 = "ahdfahdjfaakdkaa";
        int count = (int) s1.chars().mapToObj(c -> (char)c).filter(c -> c == 'a').count();

        System.out.println(count);
    }
}
