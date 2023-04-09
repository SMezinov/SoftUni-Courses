package src.Fundamentals.BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class P05Messages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int symbolCount = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= symbolCount ; i++) {
            String number = scanner.nextLine();
            int numberOfDigits = number.length();
            char firstDigit = number.charAt(0);
            int mainDigit = Integer.parseInt("" + firstDigit);
            int offset = (mainDigit - 2) * 3;
            int letterIndex = 0;
            if(mainDigit == 8 || mainDigit == 9){
                letterIndex = (offset + 1) + numberOfDigits - 1;
            } else {
                letterIndex = offset + numberOfDigits - 1;
            }
            char print;
            if(mainDigit == 0){
                print = 32;
            } else {
                print = (char) +(97 + letterIndex);
            }
            System.out.print(print);
        }
    }
}
