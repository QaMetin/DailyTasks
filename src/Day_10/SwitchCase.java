package Day_10;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 /*       System.out.println("Kaçıncı ay");
        int numOfMonth = sc.nextInt();

        switch (numOfMonth) {
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Şubat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayıs");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Ağustos");
                break;
            case 9:
                System.out.println("Eylül");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Ekim");
                break;
            case 12:
                System.out.println("Ekim");
                break;
            default:
                System.out.println("Girdiğiniz sayı bir ayla eşleşmiyor");


        }


        System.out.println("Hangi gün");
        int numOfDay = sc.nextInt();

        switch (numOfDay) {


            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girdiğiniz sayı bir günle eşleşmiyor");
        }

        System.out.println("Hesap Makinesi Hazır");
        int num1=sc.nextInt();
        sc.nextLine();
        String aritmetik= sc.nextLine();
        int num2=sc.nextInt();

        int sonuc=0;

        switch (aritmetik){
            case "+":
                sonuc=num1+num2;
                System.out.println("sonuc   = " + sonuc );
                break;
            case"-":
                sonuc=num1-num2;
                System.out.println("sonuc   = " + sonuc );
                break;
            case"*":
                sonuc=num1*num2;
                System.out.println("sonuc   = " + sonuc );
                break;
            case"/":
                sonuc=num1/num2;
                System.out.println("sonuc   = " + sonuc );
                break;
            default:
                System.out.println("Girdiğiniz matematiksel işlem işaret yanlıştır");


        }*/
        System.out.println("Beden Numarasını Giriniz");
        int beden = sc.nextInt();


        switch (beden) {
            case 38:

                System.out.println(beden + " numara bir small bedendir.");
                break;
            case 40:

                System.out.println(beden + " numara bir small bedendir.");
                break;
            case 42:

                System.out.println(beden + " numara bir small bedendir.");
                break;
            case 44:
                System.out.println(beden + " numara bir medium bedendir.");
                break;
            case 46:
                System.out.println(beden + " numara bir medium bedendir.");
                break;
            case 48:
                System.out.println(beden + " numara bir medium bedendir.");
                break;
            case 50:
                System.out.println(beden + " numara bir large bedendir.");
                break;
            case 52:
                System.out.println(beden + " numara bir large bedendir.");
                break;
            case 54:
                System.out.println(beden + " numara bir large bedendir.");
                break;

            default:
                System.out.println("Girdiğiniz beden numarası bulunmamaktadır.");


        }


    }
}