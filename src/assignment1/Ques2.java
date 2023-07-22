package assignment1;

public class Ques2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,2,3,4,1,1,0};
        int smallestSum = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length - 1; i++) {
            int sum = arr[i] + arr[i+1];
            if(sum < smallestSum) {
                smallestSum = sum;
            }
        }
        System.out.println(smallestSum);
    }
}
