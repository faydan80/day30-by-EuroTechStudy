package days.day30a_6_12_2022;

import java.util.Random;
import java.util.Scanner;

public class ScannerExc3 {
    public static void main(String[] args) {
        int sayi2 = random();
        System.out.println("The secret number is = " + sayi2);
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type a number: __");
        int guess;
        int sayac=0;

        do {
            guess = sc.nextInt();
            if (guess < sayi2) {
                System.out.print("Please type a bigger number: __");


            } else if (guess > sayi2) {
                System.out.print("Please type a smaller number:__ ");


            } else {
                System.out.println("Congratulations!");
            }
            sayac++;

        } while (sayi2 != guess);
        System.out.println("You have found the right number at your "+sayac+". trial!");
    }

    public static int random() {
        Random randomNum = new Random();
        int sayi = randomNum.nextInt(25);

        return sayi;
    }

}