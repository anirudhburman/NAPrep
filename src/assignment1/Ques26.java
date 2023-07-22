package assignment1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques26 {
    public static void main(String[] args) {
        int n = 4;
        if(isPrime(n)) {
            System.out.println(n + " is prime");
            System.exit(0);
        }
        int[] facts = new int[10];
        int index = 0;
        for(int i = 2; i <= n / 2; i++) {
            if(n % i == 0) {
                facts[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(facts).filter(num -> num != 0).filter(Ques26::isPrime).toArray()));
    }
    public static boolean isPrime(int n) {
        for(int i = 2; i <= (int) Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
