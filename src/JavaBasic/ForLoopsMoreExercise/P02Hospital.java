package ForLoopsMoreExercise;

import java.util.Scanner;

public class P02Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatient = 0;
        int untreatedPatient = 0;
        int doctors = 7;
        for (int i = 1; i <= period; i++) {
            int patients = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0) {
                if (treatedPatient < untreatedPatient) {
                    ++doctors;
                }
            }
           if (patients > doctors){
               treatedPatient = treatedPatient + doctors;
               untreatedPatient = untreatedPatient + (patients - doctors);
           } else if (patients <= doctors){
               treatedPatient = treatedPatient + patients;
           }
        }

        System.out.printf("Treated patients: %d.%n",treatedPatient);
        System.out.printf("Untreated patients: %d.",untreatedPatient);
    }
}
