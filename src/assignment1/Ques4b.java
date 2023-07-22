package assignment1;

public class Ques4b {

    public static String withoutRecursion(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return sb.toString();
    }
    public static String withRecursion(String s) {
        if (s.isEmpty()) {
            return s;
        }
        return withRecursion(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        String str = "Ani";
        String wr = withRecursion(str);
        String wor = withoutRecursion(str);
        System.out.println("With Recursion = " + wr);
        System.out.println("Without Recursion = " + wor);
    }
}
