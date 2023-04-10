package src.ExamJavaBasic;

import java.util.Scanner;

public class P06TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        String winningWord = "";
        double winningScore = 0;
        while (!word.equals("End of words")) {
            double sum = 0;
            for (int i = 0; i < word.length(); i++) {
                sum += word.charAt(i);
            }
            if (word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u' || word.charAt(0) == 'y' ||
                    word.charAt(0) == 'A' || word.charAt(0) == 'E' || word.charAt(0) == 'I' || word.charAt(0) == 'O' || word.charAt(0) == 'U' || word.charAt(0) == 'Y'){
                sum = sum * word.length();
            } else {
                sum = Math.floor(sum / word.length());
            }
            if (sum >= winningScore){
                winningScore = sum;
                winningWord = word;
            }
            word = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",winningWord,winningScore);
    }
}
