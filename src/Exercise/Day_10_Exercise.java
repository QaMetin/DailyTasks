package Exercise;

import java.util.Scanner;

public class Day_10_Exercise {
    public static void main(String[] args) {

        /*K onsoldan sayı alarak bir sayı tahmin programı
        yazın Nested if yapısı kullanın Tahmin sayıdan
        küçük ama yakın sa( sayının yarı değerinden daha yakın veya
        çok küçükse uygun bir mesaj versin Tahmin sayıdan
        büyük, ancak yakın veya uzak ise buna uygun
        mesajlar versin Elbette isabetli tahmin de bir tebrik
        mesajı yazdırın*/

        Scanner scan=new Scanner(System.in);
        int sayi=156;
        System.out.println("Pozitif bir sayı tahmin et: ");
        int tahmin=scan.nextInt();

        if(tahmin<sayi) {

            if (tahmin > sayi / 2) {
                System.out.println("yaklaştın biraz daha büyük bir sayı tahmin et");
            } else if (tahmin < sayi / 2) {
                System.out.println("yakın değilsin daha büyük bir sayı söyle");
            } else {
                System.out.println("Pek yakın sayılmazsın");
            }
        }else if (tahmin>sayi){

            if (tahmin<sayi+sayi/2){
                System.out.println("Tahmininiz yakın ancak daha küçük bir sayı söylemelisiniz");

            } else if (tahmin>sayi+sayi/2) {
                System.out.println("Çok büyük bir sayı söyledin daha küçük bir tahminde bulun");
            }else {
                System.out.println("Pek yakın değilsin biraz daha küçük bir sayı söyle");
            }

        }else{
            System.out.println("Tahmininiz doğrudur TEBRİKLER");
        }


    }
}
