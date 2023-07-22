package assignment1;

public class Ques20 {
    public static void main(String[] args) {
        int[] arr = {948, 327,831,132,198};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int n : arr) {
            if(n < smallest) {
                smallest = n;
            }
            if(n > largest) {
                largest = n;
            }
        }
        System.out.println("smallest = " + smallest);
        System.out.println("largest = " + largest);
    }
}
