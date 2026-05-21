package MethodsExercises;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     String text = scanner.nextLine();

     printMiddleChar(text);
    }
    public static void printMiddleChar(String text) {
        if(text.length() % 2 != 0) {
            int indexOfMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleChar));
        } else {
            int firstMiddleChar = (text.length() / 2) - 1;
                    int secondMiddleChar = text.length() / 2;

            System.out.print(text.charAt(firstMiddleChar));
            System.out.print(text.charAt(secondMiddleChar));
        }
    }
}
