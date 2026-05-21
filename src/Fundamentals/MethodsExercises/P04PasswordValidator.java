package MethodsExercises;

import java.util.Scanner;

public class P04PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printPasswordStatus(input);

    }

    public static boolean checkCharactersCount(String password) {
        boolean validation = true;
        if (password.length() > 10 || password.length() < 6) {
            validation = false;
        }
        return validation;
    }

    public static boolean checkForSuspendedChar(String password) {
        boolean validation = true;
        for (char symbol : password.toCharArray()) {
            if (symbol < 48) {
                validation = false;
            } else if (symbol > 57 && symbol < 65) {
                validation = false;
            } else if (symbol > 90 && symbol < 97) {
                validation = false;
            } else if (symbol > 122) {
                validation = false;
            }
        }
        return validation;
    }

    public static boolean checkForDigits(String password) {
        boolean validation = true;
        int digitCounter = 0;
        for (char symbol : password.toCharArray()) {
            if (symbol > 47 && symbol < 58) {
                digitCounter++;
            }
        }
        if (digitCounter < 2) {
            validation = false;
        }
        return validation;
    }
    public static void printPasswordStatus(String password) {
        if (!checkCharactersCount(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!checkForSuspendedChar(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!checkForDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if (checkForDigits(password) && checkCharactersCount(password) && checkForSuspendedChar(password)) {
            System.out.println("Password is valid");
        }
    }
}
