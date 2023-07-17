import java.util.Scanner;

public class JavaPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.nextLine();
        String wordReversed = "";

        for (int i = word.length() - 1; i > 0; i--) {
            wordReversed = wordReversed + word.charAt(i);
        }
        if (word.equals(wordReversed)){
            System.out.println("The word: " + word  + " reversed is: " + wordReversed + ". It's a palindrome.");
        } else{
            System.out.println("The word: " + word + " reversed is: " + wordReversed + ". It's not a palindrome.");
        }
    }
}
