package Day_9;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {

       /* int hız = 10;
        boolean isMoving = true;
        if (isMoving) {
            hız++;


        }
        System.out.println("hız=" + hız);
        System.out.println("-----------------------");

        int x = 10;
        int y = 0;
        if (x==10) {
            y = 20;
        }
        System.out.println("y= " + y);
        System.out.println("-----------------------");


        Scanner scan=new Scanner(System.in);
        // Task 2

        int temp=10;
        if (temp>=20){
            System.out.println("kelebekler uçar");
        }else {
            System.out.println("kelebekler soğukta pek uçmaz");
        }

        System.out.println("-----------------------");

        int harclik=6;

        if (harclik<5){
            harclik=harclik+10;
            System.out.println("harclık = " +harclik);

        } else{
            System.out.println("Ayşe bugün "+harclik+ " TL harçlık ile okula gidecek");
            System.out.println("harclık = " +harclik);

        }
        System.out.println("--------------------------------------");

        System.out.println("Blance Değerini Giriniz");
        double balance= scan.nextDouble();
        System.out.println("suit değerini giriniz");
        double priceOfSuit=scan.nextDouble();

        if(balance>=priceOfSuit){
            System.out.println("takım ");

        }


        System.out.println("--------------------------------------");


        //Task_5
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Lütfen sayıları girin");
        a=sc.nextInt();
        b=sc.nextInt();

        if(a==b){
            System.out.println("sayılar eşit");


        }else{
            System.out.println("sayılar eşit değildir");

        }
        System.out.println("--------------------------------");
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        System.out.println("Lütfen sayıları girin");
        a=sc.nextInt();
        b=sc.nextInt();
        if (a>b){
            System.out.println(a+" büyük sayıdır");
        }else if (b>a){
            System.out.println(b+" büyük sayıdır");

        }else{
            System.out.println("sayılar eşittir");

        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen sayıları girin");
        int sayi1=sc.nextInt();
        int sayi2=sc.nextInt();
        int sayi3=sc.nextInt();

        if(sayi1+sayi2>sayi3){
            sayi3=Math.abs(sayi1-sayi2);
            System.out.println("sayı3= "+sayi3);


        }
        System.out.println("----------------------------------------------");

  //Task9
        Scanner sc=new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin");
        int number=sc.nextInt();

        if(number%2==0){
            System.out.println("Bu bir çift sayıdır");

        }else{
            System.out.println("Bu bir tek sayıdır");

        }
//Task10
        int A=90;
        int B=80;
        int C=10;
        if(A+B+C==180) {


            if (A == 90 || B == 90 || C == 90) {
                System.out.println("Bu bir dik üçgendir");

            } else {
                System.out.println("Bu bir üçgendir");
            }

        }else{
            System.out.println("Bu bir üçgen olamaz");


        }

        */

        Scanner sc=new Scanner(System.in);

        System.out.print("Lütfen notunuzu giriniz: ");
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




    }
}
