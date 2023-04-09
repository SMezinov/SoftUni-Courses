package src.ExamJavaBasic;
import java.util.Scanner;

public class P04CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int movieCount = 0;
        int othersCOunt = 0;
        while (!input.equals("End")) {
            if (input.length() >= 8) {
                voucher = voucher - (input.charAt(0) + input.charAt(1));
                if (voucher < 0) {
                    break;
                }
                movieCount++;
            } else {
                voucher = voucher - (input.charAt(0));
                if (voucher < 0) {
                    break;
                }
                othersCOunt++;
            }
            input = scanner.nextLine();
        }
        System.out.printf("%d%n%d",movieCount,othersCOunt);
    }
}
