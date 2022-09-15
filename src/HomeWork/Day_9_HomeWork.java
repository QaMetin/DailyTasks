package HomeWork;

import java.util.Scanner;

public class Day_9_HomeWork {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

      /*  System.out.print("Lütfen notunuzu giriniz: ");
        int not1= sc.nextInt();
        if(not1>=85 && not1<100){
            System.out.println("Notunuzun harf karşığı: A");

        } else if (not1>=70 && not1<85) {
            System.out.println("Notunuzun harf karşığı: B");

        } else if (not1>=55 && not1<70) {
            System.out.println("Notunuzun harf karşığı: C");

        } else if (not1>=40 && not1<55) {
            System.out.println("Notunuzun harf karşığı: D");

        }else{
            System.out.println("Notunuzun harf karşığı : F");
        }

        System.out.println("----------------------------------------------");*/

        int a,b,c;
        System.out.println("Lütfen 3 sayı giriniz :");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();

        if (a>b && a>c){
            System.out.println( a+ " En büyük sayıdır");

        } else if (b>a && b>c) {
            System.out.println( b+ " En büyük sayıdır");

        }else{
            System.out.println( c+ " En büyük sayıdır");
        }


    }

}
