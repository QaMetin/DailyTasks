package HomeWork;

import java.util.Scanner;

public class Day_8_Homework {
    public static void main(String[] args) {
        /* Odev_1

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 10 ile 100 arasında bir sayı giriniz= ");
        float sayi= scan.nextFloat();
        sayi*=5;
        sayi/=2;
        sayi+=1;
        sayi%=4;
        sayi-=1;
        System.out.println("sonuc = " + sayi);*/

        //Ödev_2
        Scanner scan=new Scanner(System.in);
        System.out.print("Araba fiyatı: ");
        double araba=scan.nextDouble();


        System.out.print("KDV         : ");
        double kdv=scan.nextDouble();
        kdv=araba*(kdv/100);
        double toplam=araba+kdv;

        System.out.print("ÖTV         : ");
        double otv=scan.nextDouble();
        double toplamTutar=(toplam*(otv/100))+toplam;
        boolean sonuc=(toplamTutar>=700000)&&(toplamTutar<1000000);
        System.out.println("Toplam Tutar: " + toplamTutar);
        System.out.println("sonuc       : " + sonuc);

      /*  Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen isminiz giriniz : ");
        String isim = scan.nextLine();

        System.out.print(" 1. Sayı= ");
        double sayi1 = scan.nextDouble();
        System.out.print(" 2. Sayı= ");
        double sayi2 = scan.nextDouble();
        System.out.print(" 3. Sayı= ");
        double sayi3 = scan.nextDouble();

        double ort = (sayi1 + sayi2 + sayi3) / 3;
        boolean bir = ort > 70 && ort < 80;
        boolean iki = ort >= 80 && ort < 90;
        boolean uc = ort >= 90 && ort < 100;
        boolean dort = !(ort == 100);
        System.out.println("---------------");
        System.out.println("ort  = " + ort);
        System.out.println("---------------");
        System.out.println("bir  = " + bir);
        System.out.println("iki  = " + !iki);
        System.out.println("uc   = " + uc);
        System.out.println("dort = " + dort);

 */
    }
}
