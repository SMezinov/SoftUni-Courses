package ExamJavaBasic;

import java.util.Scanner;

public class P04GrandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());

        double sumRakia = 0;
        double sumGrades = 0;
        for (int i = 1; i <= days ; i++) {
            double rakia = Double.parseDouble(scanner.nextLine());
            double rakiaGrade = Double.parseDouble(scanner.nextLine());
            sumRakia += rakia;
            sumGrades += rakia * rakiaGrade;
        }
        double grades = sumGrades / sumRakia;
        System.out.printf("Liter: %.2f%nDegrees: %.2f%n",sumRakia,grades);
        if (grades < 38){
            System.out.println("Not good, you should baking!");
        } else if (grades < 42){
            System.out.println("Super!");
        } else if (grades > 41){
            System.out.println("Dilution with distilled water!");
        }

    }
}
