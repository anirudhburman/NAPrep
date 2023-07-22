package assignment1;

public class Ques8 {
    public static void main(String[] args) {
        String str = "Capgemini";
        int vowelCount = (int) str.chars()
                .map(Character::toLowerCase)
                .filter(Character::isLetter)
                .filter(ch -> "aeiou".indexOf(ch) != -1)
                .count();

        int consonantCount = (int) str.chars()
                .map(Character::toLowerCase)
                .filter(Character::isLetter)
                .filter(ch -> "aeiou".indexOf(ch) == -1)
                .count();

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
