package Exercise;

import java.util.Scanner;

public class Day_9_Exercise {
    public static void main(String[] args) {
      /*  int hız=10;
        boolean isMoving=true;
        if (isMoving){
            hız++;

        }
        System.out.println("hız = " + hız);
        System.out.println("--------------------------------");

        int x = 10;
        int y = 0;
        if (x==10){
            y=20;


        }
        System.out.println("y = " + y);
        System.out.println("-----------------------------------");
//Tasks2

        int temp=10;
        if (temp>=20){

            System.out.println("Kelebekler uçar");

        }else {
            System.out.println("Kelebekler uçmaz");
        }
        System.out.println("------------------------------------");
//Tasks3

        int harclık=3;
        if (harclık<5){
            harclık=harclık+10;


        }else {
            System.out.println("Ayse bugun  " + harclık + " TL ile okula gidecek");

        }
        System.out.println("Ayşenin harçlığı= " + harclık);
        System.out.println("------------------------------------");

//Tasks4
        int balance=200;
        int takım=50;

        if (balance>=takım){
            System.out.println("Takım satın alınabilir");
        }else{
            System.out.println("Yetersiz bakiye");
        }
        System.out.println("------------------------------------");
//Task5
        Scanner sc=new Scanner(System.in);

        int sayi1;
        int sayi2;
        System.out.println("lütfen sayıları girin");
        sayi1= sc.nextInt();
        sayi2= sc.nextInt();

        if (sayi1==sayi2){
            System.out.println("sayılar eşit");
        }else {
            System.out.println("sayılar eşit değildir");
        }
        System.out.println("------------------------------------");
//Task6

        if (sayi1>sayi2){
            System.out.println(sayi1+"  büyük sayıdır");
            
        } else if (sayi2>sayi1) {
            System.out.println(sayi2+"  büyük sayıdır");
        }else {
            System.out.println("sayılar eşittir");
        }
        System.out.println("------------------------------------");

//Task7
        int a,b,c;
        a=11;
        b=20;
        c=30;
        if (a+b>c){
            c=Math.abs(a-b);
            System.out.println("c= "+c);

        }
        System.out.println("------------------------------------");
//Task8
        Scanner sc=new Scanner(System.in);
        System.out.print("Lütfen sayıyı giriniz:");
        int number=sc.nextInt();
        if (number%2==0){
            System.out.println("sayı çifttir");

        }else {
            System.out.println("sayı tektir");
        }

        System.out.println("------------------------------------");*/
//Task10
        int a=0;
        int b=0;
        int c=90;
      if ((a+b+c==180) && (a!=0 && b!=0 && c!=0 )){

          if (a==90||b==90||c==90){
               System.out.println("Bu bir dik üçgendir");
          }else {
              System.out.println("Bu bir üçgendir");
          }
      }else{
          System.out.println("Bu bir üçgen olamaz");
      }




    }
}
