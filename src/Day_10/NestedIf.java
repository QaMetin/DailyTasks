package Day_10;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = sc.nextInt();

        if (number>5){
            System.out.println("sayı 5 ten büyüktür");
            if (number>25){
                System.out.println("sayı 25 ten büyüktür");
                if (number>50){
                    System.out.println("sayı 50 ten büyüktür");

                }else {
                    System.out.println("sayı 50 den küçüktür");
                }
            }else {
                System.out.println("sayı 25 ten ve 50 den küçüktür");
            }
        }else {
            System.out.println("sayı 5 ten 25 ten ve 50 den küçüktür");
        }


    }
}
