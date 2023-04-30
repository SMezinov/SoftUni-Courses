package ForLoopsMoreExercise;

import java.util.Scanner;

public class P08EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int oldSum = 0;
        int maxDiff = 0;
        int diff = 0;
        int oldSum2 = 0;
        int diff2 = 0;
        for (int i = 1; i <= n; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            int number2 = Integer.parseInt(scanner.nextLine());

            int sum = number1 + number2;
            if (i % 2 != 0) {
                oldSum = sum;
            } else {
                diff = Math.abs(oldSum - sum);
                oldSum2 = sum;
            }
            if ((n % 2 != 0) && (i == n) && (i != 1)) {
                diff2 = Math.abs(oldSum2 - sum);
                if (diff2 > diff) {
                    diff = diff2;
                }
            }
            if (diff > maxDiff) {
                maxDiff = diff;
                oldSum = sum;
            }
        }
        if (maxDiff == 0) {
            System.out.printf("Yes, value=%d", oldSum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }
    }
}
