package assignment1;

public class Ques9 {
    public static void main(String[] args) {
        String s = "s123";
        try {
            System.out.println(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            System.out.println("String must have only numbers");
        }
    }
}
