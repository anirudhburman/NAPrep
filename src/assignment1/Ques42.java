package assignment1;

public class Ques42 {
    public static void main(String[] args) {
        String s1 = "capgac";
        String s2 = new StringBuilder(s1).reverse().toString();
        String s3 = String.valueOf(s1.charAt(0) + s1.charAt(1));
        String s4 = String.valueOf(s2.charAt(0) + s2.charAt(1));
        if(s3.matches(s4)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
