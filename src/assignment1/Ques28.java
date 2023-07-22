package assignment1;

public class Ques28 {
    public static void main(String[] args) {
        int num = 145;
        int copy = num;
        int sum = 0;

        while(num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        if(sum == copy) {
            System.out.println("It is a strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
