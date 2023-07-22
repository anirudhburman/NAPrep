package assignment1;

public class Ques4a {
    public static void main(String[] args) {
        int num = 4;
        int pow = -2;
        double res = 1;
        for(int i = 1; i <= Math.abs(pow); i++) {
            res = res / num;
        }
        System.out.println("res = " + res);
    }
}
