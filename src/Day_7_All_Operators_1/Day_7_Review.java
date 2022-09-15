package Day_7_All_Operators_1;

import java.util.Scanner;

public class Day_7_Review {
    public static void main(String[] args) {

        //int a=4;
       // System.out.println(a++ +" anın yeni değeri: " +a);
        //System.out.println(a); //5
        //System.out.println(++a); //6
        //System.out.println(a--); //4 a=3
        //System.out.println(--a); //2 a=2*/

        // ornek

      //int i=5, j;
       // j=i++;
        // System.out.println(j);

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        double sayi=scan.nextInt();
        double sayi2=sayi;
        sayi*=2;
        sayi+=10;
        sayi/=2;
        sayi=sayi-sayi2;
        System.out.println(sayi);


    }



}

