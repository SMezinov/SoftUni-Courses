package MethodsExercises;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        while (!number.equals("END")) {
            isPalindromeOrNot(number);
            number = scanner.nextLine();
        }
    }

    public static void isPalindromeOrNot(String text) {
        int backReadLength = text.length() - 1;
        boolean isPalindrome = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(backReadLength)) {
                isPalindrome = false;
            }
            backReadLength--;
        }
        if (isPalindrome) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}