package Exercise;

import java.util.Scanner;

public class Day_29 {
    public static void main(String[] args) {
        double fiyat1,fiyat2,fiyat3,toplamFiyat;
        String kitap1,kitap2,kitap3;
        Scanner sc=new Scanner(System.in);
        System.out.println("kitap1 in ismini ve fiyatını girin:");
        kitap1=sc.nextLine();
        fiyat1=sc.nextDouble();
        sc.nextLine();
        System.out.println("kitap2 in ismini ve fiyatını girin:");
        kitap2=sc.nextLine();
        fiyat2=sc.nextDouble();
        sc.nextLine();
        System.out.println("kitap3 in ismini ve fiyatını girin:");
        kitap3=sc.nextLine();
        fiyat3=sc.nextDouble();
        toplamFiyat=fiyat1+fiyat2+fiyat3;
        System.out.println("Kitap1 fiyatı: "+ fiyat1+","+" Kitap2 fiyatı: "+fiyat2+ "," +" Kitap3 fiyatı: "+fiyat3);
        System.out.println("Toplam Fiyat: "+toplamFiyat+"TL");

    }
}
