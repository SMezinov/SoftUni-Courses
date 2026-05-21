package MethodsExercises;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());

        double divisionFactorials = getFactorial(firstNumInput) / getFactorial(secondNumInput);
        System.out.printf("%.2f", divisionFactorials);
    }

    public static double getFactorial(int num) {
        double sum = 1;
        for (int i = 1; i <= num; i++) {
            sum = sum * i;
        }
        return sum;
    }
}
