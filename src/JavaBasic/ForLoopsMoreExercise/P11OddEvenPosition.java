package ForLoopsMoreExercise;

import java.util.Scanner;

public class P11OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = Double.parseDouble(scanner.nextLine());

        double oddSum = 0;
        double oddMax = -1000000000;
        double oddMin = 1000000000;
        double evenSum = 0;
        double evenMax = -1000000000;
        double evenMin = 1000000000;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            double num = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenCount++;
                evenSum += num;
                if (num > evenMax) {
                    evenMax = num;
                }
                if (num < evenMin) {
                    evenMin = num;
                }

            } else {
                oddCount++;
                oddSum += num;
                if (num > oddMax) {
                    oddMax = num;
                }
                if (num < oddMin) {
                    oddMin = num;
                }
            }
        }

        if (n == 0) {
            System.out.printf("OddSum=0.00,%nOddMin=No,%nOddMax=No,%nEvenSum=0.00,%nEvenMin=No,%nEvenMax=No");
        } else if (oddCount == 0) {
            System.out.printf("OddSum=0.00,%nOddMin=No,%nOddMax=No,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", evenSum, evenMin, evenMax);
        } else if (evenCount == 0) {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=0.00,%nEvenMin=No,%nEvenMax=No", oddSum, oddMin, oddMax);
        } else {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%nEvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f", oddSum, oddMin, oddMax, evenSum, evenMin, evenMax);
        }
    }
}
