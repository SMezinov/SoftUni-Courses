package WhileLoopsMoreExercise;

import java.util.Scanner;

public class P03StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();

        String word = "";
        boolean cSwitch = false;
        boolean oSwitch = false;
        boolean nSwitch = false;
        while (!letter.equals("End")) {
            char select = letter.charAt(0);
            if ((select >= 'a' && select <= 'z') || (select >= 'A' && select <= 'Z')) {

                if (letter.equals("c")) {
                    if (cSwitch) {
                        word += letter;
                    } else {
                        cSwitch = true;
                    }
                } else if (letter.equals("o")) {
                    if (oSwitch) {
                        word += letter;
                    } else {
                        oSwitch = true;
                    }
                } else if (letter.equals("n")) {
                    if (nSwitch) {
                        word += letter;
                    } else {
                        nSwitch = true;
                    }
                } else {
                    word += letter;
                }

                if (cSwitch && nSwitch && oSwitch) {
                    System.out.print(word + " ");
                    cSwitch = false;
                    nSwitch = false;
                    oSwitch = false;
                    word = "";
                }
            }

            letter = scanner.nextLine();
        }

    }
}
