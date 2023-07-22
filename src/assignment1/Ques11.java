package assignment1;

public class Ques11 {
    public static void main(String[] args) {
        String s1 = "capgemini";
        String s2 = "peni";
        StringBuilder matchingChars = new StringBuilder();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (!s2.contains(String.valueOf(ch))) {
                matchingChars.append(ch);
            }
        }
        System.out.println(matchingChars);
    }
}
