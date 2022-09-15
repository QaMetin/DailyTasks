package Day_11_Loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
      /*  System.out.println("Giriş");
        for(byte i=0;i<10;i--){

            System.out.println(i+" -Metin");
        }

        System.out.println("çıkış");

        for(int i=1;i<=20;i++){

            System.out.println(i+" Merhaba dünya");

       }

        for (int i = 1; i < 100; i++) {

            System.out.println(i + " ");

        }

        for (int i = 15; i < 100; i++) {

            System.out.println(i + " ");

        }
        for (int i = 100; i>=0;i-- ) {

            System.out.println(i + " ");
        }

        for (int i = 0; i < 100; i+=2) {

            System.out.println(i + " ");

        }
// 2.yol
        for (int i = 0; i < 100; i++) {
            if(i%2==0) {

                System.out.println(i + " ");
            }
        }
        for (int i = 10; i <= 1000; i++) {
            if(i%10==0) {

                System.out.println(i + " ");
            }
        }


       int sonuc=1;
        for (int i = 6; i>0; i--) {

            sonuc=i*sonuc; // veya sonuc*=

                System.out.println(sonuc + " ");
            }




        for (int i = 0; i < 20; i++) {
            int sonuc;
            sonuc = i * i * i;
            System.out.println(i+  " nin küpü: "+sonuc);

        }


        Scanner scan=new Scanner(System.in);
        System.out.print(" Lütfen bir kelime yazınız");
        String kelime=scan.nextLine();
        System.out.print(" kaç defa ekrana yazdırmak istiyorsunuz");
        int tekrarSayisi= scan.nextInt();
        for (int i=0;i<tekrarSayisi; i++){
            System.out.println(kelime);
        }


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz ");
        int sayi= scan.nextInt();
        int sonuc=0;
        for (int i=0;i<sayi; i++){
            sonuc+=i;

        }

        System.out.println(sayi+" kadar olan toplam: "+ sonuc );

*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 0 ile 1000 arasında bir sayı giriniz ");
        int sayi= scan.nextInt();
        int teksayi=0;
        int ciftsayi=0;
        for (int i=0;i<=sayi; i++){
            if(i%2==0){
                ciftsayi+=i;
            }else{
                teksayi+=i;
            }


        }
        System.out.println("Tek sayılar toplamı:"+teksayi);
        System.out.println("Çift sayılar toplamı:"+ciftsayi);
        /*

        Scanner scan=new Scanner(System.in);
        System.out.print("taban giriniz: ");
        int taban=scan.nextInt();
        System.out.print("us giriniz: ");
        int us= scan.nextInt();

        int sonuc=1;
        for(int i=0; i<us; i++){
            sonuc*=taban;
        }
        System.out.println(sonuc);*/
    }

}
