package assignment1;

public class Ques1 {
    public static void main(String[] args) {
        String s1 = "Madam";
        String rev = s1.chars().mapToObj(c -> String.valueOf((char)c)).reduce("", (a,b) -> b + a);
        if(rev.equalsIgnoreCase(s1)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
