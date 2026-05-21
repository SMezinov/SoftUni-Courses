package MethodsExercises;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= input; i++) {
             if(isLeastOneDigitOdd(i) && isSumOfDigitsIsDivisibleBy8(i)) {
                System.out.println(i);
            }
        }

    }

    public static boolean isSumOfDigitsIsDivisibleBy8(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        if (sum % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isLeastOneDigitOdd(int num) {
        while (num > 0) {
            int actualDigit = num % 10;
            if (actualDigit % 2 != 0) {
                return true;
            } else {
                num /= 10;
            }
        }
        return false;
    }
}
