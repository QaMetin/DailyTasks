package Day_21_String_Class;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {

        writeWords();
        //System.out.println(fillWithDot("a"));
        //System.out.println(controlword("konak"));

    }
   //9-Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada
    // 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.

    public static String writeWords(){
         Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen iki kelime giriniz");
        String str1=scan.nextLine();
        String str2=scan.nextLine();

        if(str1.length()>str2.length()){
            String result="";

            for (int i = 0; i < 2; i++) {
                System.out.print(str2);
            }
            for (int i = 0; i < 30; i++) {
                System.out.print(str1);
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(str2);
            }

        }else{
            for (int i = 0; i < 2; i++) {
                System.out.print(str1);
            }
            for (int i = 0; i < 30; i++) {
                System.out.print(str2);
            }
            for (int i = 0; i < 2; i++) {
                System.out.print(str1);
            }
        }



        return "";
    }

    //10-Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.
    //Sabun Sabun
    // Merhaba Merha
    // Ali Ali..
    // Hey Hey..
    // Pi Pi…

    public static String fillWithDot(String kelime){

        String result;
        String dot=".....";
        if (kelime.length()<5) {
            result=kelime.concat(dot.substring(0,5-kelime.length()));
            return result;

        }else{
            return kelime.substring(0, 5);
        }



    }
    //11-Kullanıcıdan bir kelime alın ve bu kelimenin ilk
    // 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.
    //Ankara false
    // Kafka true
    // Salsa true
    // Saksı false

    public static boolean controlword(String word){

        if(word.substring(0,2).equalsIgnoreCase(word.substring(word.length()-2) )){
            return true;

        }
        return false;


    }
//Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf eşit sayıda içerecek,
// büyük küçük harf göz ardı edilecek) true oluşmuyorsa false yazdırın. (anagram kelime ise)
//İftar – Tarif true
// Zehra – Ezhar true
// Nefes – Enfes true
// Selcuk-Elyase false




}
