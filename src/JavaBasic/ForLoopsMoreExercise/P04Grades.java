package ForLoopsMoreExercise;

import java.util.Scanner;

public class P04Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int students = Integer.parseInt(scanner.nextLine());

        int students23 = 0;
        int students34 = 0;
        int students45 = 0;
        int students5Plus = 0;
        double allNote = 0;

        for (int i = 1; i <= students ; i++) {
            double note = Double.parseDouble(scanner.nextLine());

            allNote += note;

            if(note < 3){
                students23++;
            } else if (note < 4){
                students34++;
            } else if (note < 5){
                students45++;
            } else {
                students5Plus++;
            }
        }

        double percentStudent23 = (students23 * 1.0 / students) * 100;
        double percentStudents34 = (students34 * 1.0 / students) * 100;
        double percentStudents45 = (students45 * 1.0 / students) * 100;
        double percentStudents5Plus = (students5Plus * 1.0 / students) * 100;
        double averageNote = allNote / students;

        System.out.printf("Top students: %.2f%%%n",percentStudents5Plus);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n",percentStudents45);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n",percentStudents34);
        System.out.printf("Fail: %.2f%%%n",percentStudent23);
        System.out.printf("Average: %.2f",averageNote);

    }
}
