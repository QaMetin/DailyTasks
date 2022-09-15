package HomeWork;

import java.util.Scanner;

public class Day_12_HomeWork {
    public static void main(String[] args) {

        // Ödev_1
//
//        for (int i=1;i<=5;i++ ) {
//
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

       //Ödev_2

        int k=1;
        for (int i=0; i<5; i++){
            for (int j=0;j<=i;j++){
                System.out.print(k);
                k++;

            }

            System.out.println();
        }

     /*   //Ödev_3


        Scanner scan=new Scanner(System.in);
        System.out.print("Yıldız üçgeni satır sayısı : ");
        int satirsayisi= scan.nextInt();
        for (int i=1;i<=satirsayisi;i++) {
            for(int j=i;j<=satirsayisi;j++){
                System.out.print(" ");
            }
            for (int k = 1; k<= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

    }
}
