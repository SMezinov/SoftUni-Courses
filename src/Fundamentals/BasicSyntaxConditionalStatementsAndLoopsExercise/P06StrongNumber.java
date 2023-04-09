package src.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P06StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stringNum = scanner.nextLine();

        int num = Integer.parseInt(stringNum);

        int sum = 0;
        for (int i = 0; i < stringNum.length(); i++) {
            char charValue = stringNum.charAt(i);
            int charNum = Character.getNumericValue(charValue);
            int buffer = 1;
            for (int j = 1; j < charNum; j++) {
                buffer += buffer * j;
            }
            sum += buffer;
        }

        if(sum == num){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
