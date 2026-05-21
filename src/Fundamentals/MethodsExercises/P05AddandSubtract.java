package MethodsExercises;

import java.util.Scanner;

public class P05AddandSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumInput = Integer.parseInt(scanner.nextLine());
        int secondNumInput = Integer.parseInt(scanner.nextLine());
        int thirdNumInput = Integer.parseInt(scanner.nextLine());

        getSumOfIntegers(firstNumInput,secondNumInput,thirdNumInput);
    }
    public static int getSumOfFirstTwoIntegers(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    public static void getSumOfIntegers(int firstNum, int secondNUm, int thirdNum) {
        System.out.println(getSumOfFirstTwoIntegers(firstNum,secondNUm) - thirdNum);
    }
}
