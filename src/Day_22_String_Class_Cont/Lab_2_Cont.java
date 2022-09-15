package Day_22_String_Class_Cont;

import org.omg.CosNaming.IstringHelper;

public class Lab_2_Cont {
    public static void main(String[] args) {
        //System.out.println(shortLongShort("mehmet", "ali"));
        // System.out.println(surname("amhemt metin olut   "));
        //System.out.println(yinelenenKarakterAt("Ananas"));
        //System.out.println(yinelenenHarfBul("  jav v a  "));
        //System.out.println(rakamBul("mer123ha45ba"));
        //System.out.println(twoLetterEnd("kafka"));
        //System.out.println(yinelenenKarakterAt2("Araba"));
        //System.out.println(harfBul("123J98!a,*/v58a5+?-"));
        //System.out.println("harfBul(\"123J98!a,*/v58a5+?-\") = " + harfBul("123J98!a,*/v58a5+?-"));
        //System.out.println(unluUnsuzHarf("ahmet**0*9*0912hkhhsas"));
        //System.out.println(addTreeLetterstoEnd("masa"));
        //System.out.println(addTreeLetterstoStart("masa"));
        //System.out.println(firstUnige("benzersiz"));
        //System.out.println(kelimekontrol("nefel", "enfes"));
        //repetitiveWord("arabba");
        //System.out.println(reverseWord("Kabas"));
        System.out.println(findSev("sev beni seveyim seni"));


    }
    //9-Kullanıcıdan 2 kelime alın kısa kelime yi başta 2 defa uzun kelimeyi ortada
    // 30 defa kısa kelimeyi tekrar sonda 2 defa yazdıran metodu yazınız.


    public static String shortLongShort(String str1, String str2) {
        String result = "";
        for (int i = 0; i < 2; i++) {
            result += str1;

        }
        for (int i = 0; i < 2; i++) {
            result += str2;

        }
        for (int i = 0; i < 2; i++) {
            result += str1;

        }

        return result;


    }
    //10-Kullanıcıdan bir kelime veya söz alın ve ilk 5 karakterini yazdırın.
    // 5 karakterin altında bir kelime girdiği taktirde 5 karaktere nokta ile tamamlayın.

    public static String nokta(String str) {
        if (str.length() >= 5) {
            return str.substring(0, 5);
        } else {
            String result = "";
            for (int i = 0; i < 5 - str.length(); i++) {
                result += ".";
            }
            return str + result;
        }
    }

    //11-Kullanıcıdan bir kelime alın ve bu kelimenin ilk
    // 2 harfi sonunda yer alıyorsa true almıyorsa false yazdırın.
    //Ankara false
    // Kafka true
    // Salsa true
    // Saksı false

    public static boolean twoLetterEnd(String str) {
        String str1 = str.toLowerCase();
        return str1.substring(0, 2).equals(str1.substring(str1.length() - 2));
    }

    //2.yol
    public static boolean twoLetterEndWith(String str) {
        String str1 = str.toLowerCase();
        return str1.substring(0, 2).endsWith(str1.substring(0, 2));  //endsWith
    }


    //Kullanıcının konsoldan ad ve soyad bilgilerini konsoldan alın Ekrana "Soy isminiz ..(soyad).. dır."
    // Yazan metodu yazınız.
    //İnput: "Harun Özsoy "
    // Output: "Soy isminiz Özsoy dır."
    //İnput:" Harun Kenan Özsoy
    // Output: "Soy isminiz Özsoy dır."

    public static String surname(String str) {
        String str1 = str.trim();
        return str1.substring(str1.lastIndexOf(" ") + 1);


    }
//Kullanıcıdan bir dize sözcük alın ve yinelenen her karakteri kelimenizden çıkartarak sonuç döndüren metodu yazınız.
// (Büyük küçük duyarlı)
//Merhaba Merhab
// Ananas Anas

    public static String yinelenenKarakterAt(String str) {
        String result = "";
        while (!str.isEmpty()) {
            result += str.charAt(0);
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }

    //2.yol
    public static String yinelenenKarakterAt2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ) {
            result += str.charAt(i);
            str = str.replace(str.substring(i, i + 1), "");
        }
        return result;
    }


    //Kullanıcıdan bir kelime alan ve sonucunda yinelenen kelimeleri string olarak return eden methot yazınız.
    //" Java " output:a
    // " Javva " output:av
    //" Derslerime cok calisiyorum" output:erslimco

    public static String yinelenenHarfBul(String str) {
        str = str.replace(" ", "");
        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);
            }
            str = str.replace(str.substring(0, 1), "");
        }
        return result;
    }
    // yazılan kelimenin içerisinde sayıları yazdıran metodu yazınız
    //merha123ba  123
    //123023ff34  1232334
    //ASCII

    public static String rakamBul(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 47 && str.charAt(i) < 58) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    // yazılan kelimenin içerisinde sadece harfleri yazdıran metodu yazınız
    //  merha123ba  merhaba
    public static String harfBul(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) {
                result += str.charAt(i);
            }

        }
        return result;
    }

   // Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve
   // ünsüz harfleri ayrı ayrı ekrana yazan programı yazınız.
   // Ankara ünlü harfler=Aa
   // Ünsüz harfler=nkr

    public static String unluUnsuzHarf(String str) {
        String unlu = "";
        String unsuz = "";
        String ozelkarakter = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)==65)||(str.charAt(i)==69)||(str.charAt(i)==73)||(str.charAt(i)==79)|| (str.charAt(i)==85)
                    ||(str.charAt(i)==97)|| (str.charAt(i)==101) ||(str.charAt(i)==105)||(str.charAt(i)==111)||
                    (str.charAt(i)==117) )
            {
                unlu += str.charAt(i);


            } else if (((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123)) ) {
                unsuz+=str.charAt(i);
            }else
            {
            ozelkarakter+=str.charAt(i);
            }

        }

        return ("unlu harfler : "+unlu+"\n"+"unsuz harfler: "+unsuz);

    }

    //16_Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3 harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer
    // Ali Ali

    public static String addTreeLetterstoEnd(String word){
        if(word.length()<4){
            return word.substring(0,3).concat(word);
        }else {

            return word.replace(word.substring(0, 3), "").concat(word.substring(0, 3));
        }

    }

   // Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3 harfini
   // kelimeden keserek kelimenin başına ekleyin.

    //Merhaba abaMerh
    // Ali Ali

    public static String addTreeLetterstoStart(String word){

        if(word.length()<4){
            return word.substring(0,3).concat(word);
        }else{
        return word.substring(word.length()-3).concat(word.replace(word.substring(word.length()-3),""));
        }

    }


    public static String firstUnige(String word){
         String benzersiz;
        for (int i = 0; i < word.length(); i++) {

            benzersiz=word.substring(i);
            if(word.substring(0,1).contains(benzersiz)){
                return ("benzersiz harf: "+ word.substring(0,1)+" dir");
            }else{

            }
            return ("benzersiz değil");
        }

      return "";
    }

//Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf eşit sayıda içerecek,
// büyük küçük harf göz ardı edilecek) true oluşmuyorsa false yazdırın. (anagram kelime ise)
//İftar – Tarif true
// Zehra – Ezhar true
// Nefes – Enfes true
// Selcuk-Elyase false

    public static boolean kelimekontrol(String word1,String word2){
        int toplam1=0;
        for (int i = 0; i < word1.length(); i++) {
            toplam1+=(int)word1.charAt(i);
        }
        int toplam2=0;
        for (int i = 0; i < word2.length(); i++) {
            toplam2+=(int)word2.charAt(i);
        }
        if(toplam1 == toplam2){
            return true;
        }else{
            return false;
        }







    }

    //Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.
    //aabccccseeeeeefff acef
    // abaccb c
    // Arsız  ardı ardına tekrar eden harf yoktur
    // amannsız n

    public static void  repetitiveWord(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.substring(1).contains(str.substring(i,i+1)) ){
                result += str;


            }


        }
        //System.out.println(result);


    }
    //23-24 _Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise true değil ise
    // false döndüren metot yazınız.
    //Kabak true
    // Nalan true

    public static boolean reverseWord(String word){
        String word1="";
        for (int i = word.length()-1; i>=0 ; i--) {
            word1+=word.charAt(i);
        }
        if(word.equalsIgnoreCase(word1)){
            return true;
        }else{
            return false;
        }

    }

    public static int findSev(String str){
        int sev=0;
        String x="sev";
            if(str.contains(x)){
                sev++;
        }
        return sev;


    }




}
