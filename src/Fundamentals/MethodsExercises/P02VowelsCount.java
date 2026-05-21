package MethodsExercises;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();

        printVowelsCount(inputText);
    }
    public static void printVowelsCount(String text) {
        text = text.toLowerCase();
        int vowelsCounter = 0;
        for (int i = 0; i < text.length() ; i++) {
            if(text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'o' || text.charAt(i) == 'i' || text.charAt(i) == 'u'){
                vowelsCounter++;
            }
        }
        System.out.println(vowelsCounter);
    }
}
