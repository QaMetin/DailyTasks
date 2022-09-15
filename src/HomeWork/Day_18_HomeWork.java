package HomeWork;

import java.util.Scanner;

public class Day_18_HomeWork {
    public static void main(String[] args) {
        yildizUcgeni();

    }

    public static void yildizUcgeni() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıldız üçgeni satır sayısı : ");
        int satirSayisi = scan.nextInt();
        for (int i = 1; i <= satirSayisi; i++) {
            for (int j = i; j <= satirSayisi; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}