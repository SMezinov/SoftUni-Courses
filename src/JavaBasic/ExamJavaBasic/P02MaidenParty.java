package ExamJavaBasic;

import java.util.Scanner;

public class P02MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double partyPrice = Double.parseDouble(scanner.nextLine());
        int loveMails = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyHolders = Integer.parseInt(scanner.nextLine());
        int pictures = Integer.parseInt(scanner.nextLine());
        int luckyGifts = Integer.parseInt(scanner.nextLine());

        double lovePrice = loveMails * 0.6;
        double rosesPrice = roses * 7.20;
        double keyHoldersPrice = keyHolders * 3.60;
        double picturesPrice = pictures * 18.20;
        double luckyPrice = luckyGifts * 22;
        double sum = (lovePrice + rosesPrice + keyHoldersPrice + picturesPrice + luckyPrice) * 0.9;
        if(loveMails + roses + keyHolders + pictures + luckyGifts >= 25){
            sum -= (sum * 0.35);
        }
        if (sum >= partyPrice){
            System.out.printf("Yes! %.2f lv left.",sum - partyPrice);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",Math.abs(sum - partyPrice));
        }

    }
}
