package HomeWork;

import java.util.Scanner;

public class Day_11_HomeWork {
    public static void main(String[] args) {

//Homework_1
 /*
        for (char i='a';i<='z';i++) {
            System.out.print(i+" ");
        }
        */

//Homework_2
//        Scanner scan=new Scanner(System.in);
//        System.out.print("Çarpım Tablosunu görmek istediğiniz sayıyı giriniz :");
        /*
        int sayi= 9;
        int sonuc;
        for(int i=1;i<=10;i++){
            sonuc=sayi*i;
            System.out.println(sayi+" * "+i+" = "+ sonuc);

        }
        */

//Homework_3

        Scanner scan = new Scanner(System.in);
        String sifre="a123b";
        System.out.println("  ----Şifreyi bulmak için 3 hakkın var----  ");

        for (int i=1;i<=3;i++){
            System.out.println(" Lütfen şifreyi giriniz : ");
            String tahmin= scan.nextLine();
            if(sifre.equals(tahmin)){
            System.out.println(i+".deneme "+"Tebrikler şifre doğru");
            break;

            } else{
                System.out.println(i+".deneme "+"Şifre yanlış");
            }
        }




    }
}
