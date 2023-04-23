package NestedLoopsMoreExsercise;

import java.util.Scanner;

public class P01UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int threeNum = Integer.parseInt(scanner.nextLine());

        boolean primeNum = false;
        boolean evenFirstNum = false;
        boolean evenThreeNum = false;

        for (int i = 1; i <= firstNum; i++) {
            if (i % 2 == 0) {
                evenFirstNum = true;
            } else {
                evenFirstNum = false;
            }

            for (int j = 1; j <= secondNum; j++) {
                if (j == 2 || j == 3 || j == 5 || j == 7) {
                    primeNum = true;
                } else {
                    primeNum = false;
                }

                for (int t = 1; t <= threeNum; t++) {
                    if (t % 2 == 0) {
                        evenThreeNum = true;
                    } else {
                        evenThreeNum = false;
                    }
                    if (primeNum && evenFirstNum && evenThreeNum) {
                        System.out.printf("%d %d %d%n", i, j, t);
                    }

                }
            }

        }

    }
}
