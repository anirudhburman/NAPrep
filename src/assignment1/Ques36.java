package assignment1;

public class Ques36 {
    public static void main(String[] args) {
        String str = "capgemini";
        System.out.println(str.chars().count());
        int count = 0;
        for(char c : str.toCharArray()) {
            count++;
        }
        System.out.println("count = " + count);
    }
}
