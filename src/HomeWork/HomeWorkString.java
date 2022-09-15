package HomeWork;

public class HomeWorkString {
    public static void main(String[] args) {


        //System.out.println( harfBul("123J98!a,*/v58a5+?-"));                      //odev
        //System.out.println(unluUnsuzHarf("ahmet**0*9*0912hkhhsas//,"));           //15.soru
        //System.out.println(addTreeLetterstoEnd("masa"));                          //16.soru
        //System.out.println(addTreeLetterstoStart("masa"));                        //17.soru
        //System.out.println(firstUnige("Merhaba"));                                 //18.soru
        //System.out.println(kelimekontrol("nefes", "enfes"));                       //19.soru 1.yol
        //System.out.println(kelimekontrol("nefel", "enfes"));                       //19.soru 2.yol
        //System.out.println(repetitiveWord("baac"));                                  //20.soru
        //System.out.println(reverseWord("Kabas"));                                     //23-24.soru
        //System.out.println(findSev("sev sev sev"));                                   //25 (konsolda 2 yazdırıyor)
        //System.out.println(findSev1("Sev seni seveni , sevmek güzeldir","sev"));      //25  (konsolda 3 yazdırıyor)
        //System.out.println(ayniSayidaDonenKelime("Ankara ile Bursa arası 500 km"));   //26.soru
        //System.out.println(acakKontrol("yapacak"));                                   //27.soru

        //21,28,29. soruları yapamadım.


    }


    // odev-yazılan kelimenin içerisinde sadece harfleri yazdıran metodu yazınız
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

    // 15_Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki ünlü ve
    // ünsüz harfleri ayrı ayrı ekrana yazan programı yazınız.
    // Ankara ünlü harfler=Aa
    // Ünsüz harfler=nkr

    public static String unluUnsuzHarf(String str) {
        String unlu = "";
        String unsuz = "";
        String ozelkar="";

        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 65) || (str.charAt(i) == 69) || (str.charAt(i) == 73) || (str.charAt(i) == 79) || (str.charAt(i) == 85)
                    || (str.charAt(i) == 97) || (str.charAt(i) == 101) || (str.charAt(i) == 105) || (str.charAt(i) == 111) ||
                    (str.charAt(i) == 117)) {
                unlu += str.charAt(i);


            } else if (((str.charAt(i) > 64 && str.charAt(i) < 91) || (str.charAt(i) > 96 && str.charAt(i) < 123))) {
                unsuz += str.charAt(i);
            } else {
                ozelkar+=str.charAt(i);
            }

        }

        return ("unlu harfler : " + unlu + "\n" + "unsuz harfler: " + unsuz+"\n"+ozelkar);

    }

    //16_Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin ilk 3 harfini kelimeden keserek sonuna ekleyin.
    //Merhaba habaMer
    // Ali Ali

    public static String addTreeLetterstoEnd(String word) {
        if (word.length() < 4) {
            return word.substring(0, 3).concat(word);
        } else {

            return word.replace(word.substring(0, 3), "").concat(word.substring(0, 3));
        }

    }

    //17- Kullanıcıdan min 3 harf olacak şekilde bir kelime alın ve bu kelimenin son 3 harfini
    // kelimeden keserek kelimenin başına ekleyin.

    //Merhaba abaMerh
    // Ali Ali

    public static String addTreeLetterstoStart(String word) {

        if (word.length() < 4) {
            return word.substring(0, 3).concat(word);
        } else {
            return word.substring(word.length() - 3).concat(word.replace(word.substring(word.length() - 3), ""));
        }

    }

// 18_22_Kullanıcıdan bir kelime alın ve bu kelimenin ilk benzersiz harfini bulun.
// (Büyük küçük harf gözardı edilecek.) Hiçbir harf benzersiz değil ise benzersiz harf yoktur ikazı versin.
// Merhaba M
// Araba r
// Karkas rotası o

    public static String firstUnige(String word) {
        word = word.replace(" ", "").toLowerCase();
        String benzersiz = "";
        for (int i = 0; i < word.length(); i++) {


            if (!word.substring(1).contains(word.substring(0, 1))) {
                benzersiz += word.substring(0, 1);
                return benzersiz;
            }
            word = word.replace(word.substring(0, 1), "");
        }

        return benzersiz;
    }

    //19_Kullanıcıdan iki kelime alın ve bu kelimeler aynı harflerden oluşuyorsa(her harf eşit sayıda içerecek,
// büyük küçük harf göz ardı edilecek) true oluşmuyorsa false yazdırın. (anagram kelime ise)
//İftar – Tarif true
// Zehra – Ezhar true
// Nefes – Enfes true
// Selcuk-Elyase false
    public static boolean anagramKontrol(String str, String str1) {
        int count = 0;
        if (str.length() == str1.length()) {
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str.charAt(i) == str1.charAt(j)) {
                        count++;
                        if (count == str.length()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    //2. yol..........
    public static boolean kelimekontrol(String word1, String word2) {
        int toplam1 = 0;
        for (int i = 0; i < word1.length(); i++) {
            toplam1 += (int) word1.charAt(i);
        }
        int toplam2 = 0;
        for (int i = 0; i < word2.length(); i++) {
            toplam2 += (int) word2.charAt(i);
        }
        if (toplam1 == toplam2) {
            return true;
        } else {
            return false;
        }

    }

    //20_Kullanıcıdan bir kelime alın ve ardı ardına tekrar eden harfleri döndüren metodu yazın.
    //aabccccseeeeeefff acef
    // abaccb c
    // Arsız  ardı ardına tekrar eden harf yoktur
    // amannsız n

    public static String repetitiveWord(String str) {

        String result = "";
        while (!str.isEmpty()) {
            if (str.substring(1).contains(str.substring(0, 1))) {
                result += str.substring(0, 1);
            }

            str = str.replace(str.substring(0, 1), "");
        }
        return result;

    }
    //21-Kullanıcıdan 1 ila 4 harf olacak şekilde 2 kelime alın, 1. veya 2. kelimeyi girdiğinde hatalı giriş yaparsa
    // uyarı verin ve kullanıcıya düzeltme imkanı verin. Her kelime için 3 kere hatalı giriş yaparsa programı
    // sonlandırın. Kullanıcı doğru giriş yaparsa 2 kelimeyi arada boşluk olacak şekilde sadece concat() metodu ile
    // birleştirerek yazdırın.
    //Slm Ali


    //23-24 _Kullanıcıdan bir kelime alın ve bu kelimenin tersten okunuşu kelime ile aynı ise true değil ise
    // false döndüren metot yazınız.
    //Kabak true
    // Nalan true

    public static boolean reverseWord(String word) {
        String word1 = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            word1 += word.charAt(i);
        }
        if (word.equalsIgnoreCase(word1)) {
            return true;
        } else {
            return false;
        }

    }

    //25_Kullanıcıdan bir input alın ve bu inputun içerisinde kaç adet sev bulunduğunu ekrana yazdırın.

    public static int findSev(String str) {
        int count = 0;
        String findword = "sev";
        for (int i = 0; i < str.length() - findword.length() - 1; i++) {
            String result = str.substring(i, i + findword.length());
            if (str.substring(i, i + findword.length()).equalsIgnoreCase(findword)) {
                count++;
            }
        }

        return count;
    }

    public static int findSev1(String str, String bul) {
        int count = 0;

        for (int i = 0; i < str.length() - bul.length() - 1; i++) {
            String result = str.substring(i, i + bul.length());
            if (str.substring(i, i + bul.length()).equalsIgnoreCase(bul)) {
                count++;
            }
        }

        return count;
    }
//26_Bursa ile Ankara kelimeli cümlenin içerinde aynı sayıda dönüyorsa true farklı sayılarda dönüyorsa
// false yazdıran metodu yazınız.
//Ankara ile Bursa arası 500 km. True
//Ankara Bursa kadar yeşil değil. Bursa bir başka. False
// İstanbul çok uzak false

    public static boolean ayniSayidaDonenKelime(String str) {
        int length = str.length();
        int lengthAnk = "Ankara".length();
        int lengthBur = "Bursa".length();
        int sumAnkara = str.toLowerCase().replace("ankara".toLowerCase(), "").length();
        int sumBursa = str.toLowerCase().replace("bursa".toLowerCase(), "").length();
        int countAnkara = (length - sumAnkara) / lengthAnk;
        int countBursa = (length - sumBursa) / lengthBur;

        return countAnkara == countBursa;

    }

    //27-Kullanıcıdan bir kelime alın ve sonu acak ile bitiyorsa true bitmiyorsa false döndüren metodu yazdırın.
//Kullanacak true
    public static boolean acakKontrol(String str) {
        return str.toLowerCase().substring(1).endsWith("acak");
    }

//28_Kullanıcıdan bir kelime alın ve bu kelimenin içerindeki harf sayılarını başına yazarak ekrana döndürün.
// (büyük küçük harfler göz ardı edilecek)
//Merhaba 1m1e1r1h2a1b
// Seni seviyorum 2s2e1n2i1v1y1o1r1u1m


//29_Kullanıcıdan bir dize sözcük alın ve en çok harfi döndüren metodu yazınız.
//Merhaba a
// aaaaaaabbcccc a
// eeemmmsssssssssshhhhhhhhhsss s


}



