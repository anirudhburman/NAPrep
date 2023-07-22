package assignment1;

public class Ques30 {
    public static void main(String[] args) {
        int num = 153;
        int copy = num;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        if(sum == copy) {
            System.out.println("Is Armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }
}
