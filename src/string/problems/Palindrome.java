package string.problems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word:");
        String str = scanner.next();
        str = str.toLowerCase();
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("the word is palindrome");
        }
        else System.out.println("The word is not a palindrome");
    }
}
