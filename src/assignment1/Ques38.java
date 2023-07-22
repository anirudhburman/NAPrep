package assignment1;

public class Ques38 {
    public static void main(String[] args) {
        String s1 = "madam";
        String rev = new StringBuilder(s1).reverse().toString();
        if(s1.equals(rev)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
