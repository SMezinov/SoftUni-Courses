package ExamJavaBasic;

import java.util.Scanner;

public class P03SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String noteOfRoom = scanner.nextLine();

        double price = 0;
        switch (roomType) {
            case "room for one person":
                price = 18;
                break;
            case "apartment":
                if(days < 10){
                    price = 25 * 0.7;
                } else if (days < 16){
                    price = 25 * 0.65;
                } else {
                    price = 25 * 0.5;
                }
                break;
            case "president apartment":
                if(days < 10){
                    price = 35 * 0.9;
                } else if (days < 16){
                    price = 35 * 0.85;
                } else {
                    price = 35 * 0.8;
                }
                break;
        }
        if(noteOfRoom.equals("positive")){
            price = price + (price * 0.25);
        } else if (noteOfRoom.equals("negative")){
            price = price - (price * 0.1);
        }
        System.out.printf("%.2f",price * (days - 1));
    }
}
