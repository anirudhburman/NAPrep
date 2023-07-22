package assignment1;

public class Ques3 {
    public static void main(String[] args) {
        int num = 3;
        int pow = 3;
        long res = 1;
        for(int i = 1; i <= pow; i++) {
            res = res * num;
        }
        System.out.println("res = " + res);
    }
}
