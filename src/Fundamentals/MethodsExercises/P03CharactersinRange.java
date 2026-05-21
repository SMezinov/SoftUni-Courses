package MethodsExercises;

import java.util.Scanner;

public class P03CharactersinRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstChar = scanner.nextLine();
        String secondChar = scanner.nextLine();
        char inputOne = firstChar.charAt(0);
        char inputTwo = secondChar.charAt(0);

        printCharactersBetweenInputs(inputOne,inputTwo);

    }
    public static void printCharactersBetweenInputs(char start, char end) {
        if(start > end){
            for (int i = end + 1 ; i < start ; i++) {
                System.out.printf("%c ",i);
            }
        } else {
            for (int i = start + 1; i < end; i++) {
                System.out.printf("%c ", i);
            }
        }
    }
}
