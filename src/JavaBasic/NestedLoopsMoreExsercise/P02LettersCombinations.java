package NestedLoopsMoreExsercise;

import java.util.Scanner;

public class P02LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        String notValidChar = scanner.nextLine();

        char first = firstChar.charAt(0);
        char second = secondChar.charAt(0);
        char notValid = notValidChar.charAt(0);

        int count = 0;
        for (int i = first; i <= second; i++) {
            if (first < 'a' || first > 'z' || second > 'z') {
                break;
            }
            for (int j = first; j <= second; j++) {
                for (int k = first; k <= second; k++) {
                    if (i != notValid && j != notValid && k != notValid) {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.print(count);
    }
}

