package WhileLoopsMoreExercise;

import java.util.Scanner;

public class P05AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 1; i <= n ; i++) {
           int num = Integer.parseInt(scanner.nextLine());
           sum += num;
        }
        double finalSum = sum / n;
        System.out.printf("%.2f",finalSum);

    }
}
