package MethodsExercises;

import java.util.Scanner;

public class P01SmallestofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstInput = Integer.parseInt(scanner.nextLine());
        int secondInput = Integer.parseInt(scanner.nextLine());
        int thirdInput = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallestInteger(firstInput,secondInput,thirdInput));
    }
    public static int getSmallestInteger(int first, int second, int third) {
        int smallest = first;
        if (second < smallest){
            smallest = second;
        }
        if (third < smallest){
            smallest = third;
        }
        return smallest;
    }
}
