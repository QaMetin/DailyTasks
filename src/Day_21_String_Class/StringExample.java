package Day_21_String_Class;

public class StringExample {
    public static void main(String[] args) {
        //System.out.println(threeWords("fsafafsa"));
        //System.out.println(boslukKaldir("araban nasıl"));

        //System.out.println(changeWord("merhaba", "a", "i"));
        //System.out.println(repeatThree("abow"));
        //System.out.println(harfSayisi("Ankara", "a"));
        //System.out.println(eraseOfLetters("merhaba","a"));
        System.out.println(controlSentence("merhaba dünya", "mer"));
        //System.out.println(kelimeSayisi("ankaran", "an"));
    }

//    Kullanıcıdan bir input alın ve girilen inputun ilk 3 harfini yazan ,
//    3 harf az ise inputu döndüren bir metot yazınız.
    public static String threeWords(String str){


        if(str.length()<3){

            return str;
        }

            return str.substring(0,3);



    }

    //Kullanıcıdan bir dize sözcük alın ve her boşluğa % ibaresi ekleyin.

    public static String boslukKaldir(String str){
        return str.replace(" ","%");
    }

    //Kullanıcın girdiği eşit uzunlukta bir kelimenin 2. yarısını döndüren bir program yazdırın.

    public static String ikinciYari(String str){
        return str.substring(str.length()/2);
    }

    //Kullanıcıdan bir kelime , değiştirmek istediği harfi/
    // harfleri ve yeni harfi/
    // harfleri alan
    // ve buna göre kelimede/
    // dizede sadece ilk bulduğu yeri değiştiren metodu yazınız.

    public static String changeWord(String str,String old,String new1){
        return str.replaceFirst(old,new1);
    }

    //Kullanıcıdan bir kelime alın ve her harfini 3 defa yazdırın.

    public static String repeatThree(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < 3; j++) {
                result=result+str.charAt(i); //2. yol str.substring(i,i+1)
            }


        }
        return result;
    }
    //Kullanıcıdan bir kelime ve bir karakter alın ve bu kelimenin istenen karakterin kaç adet
    // olduğunu döndüren metodu yazınız. (büyük küçük harf göz ardı edilecek)
    //Ankara,a  3
    // Edirne,e 2
    // bulamaz ise 0 döndüren programı yazınız.


    public static int harfSayisi(String kelime,String harf){
        int count=0;
        for (int i = 0; i < kelime.length(); i++) {
            if(kelime.substring(i,i+1).equalsIgnoreCase(harf)){
                count++;
            }
        }
        return count;
    }
    //Kullanıcıdan 2 kelime  alın ve bu kelimenin istenen 2. kelimenim ilk kelimede kaç adet bulunduğunu ekrana yazınız.
    // (büyük küçük harf göz ardı edilecek)
    //Ankara,ank  1
    // sarmalasaksa,  sa 3
    // bulamaz ise 0 döndüren programı yazınız.

    public static int kelimeSayisi(String kelime,String harf){
        int count=0;
        for (int i = 0; i < kelime.length()-(harf.length()-1); i++) {
            if(kelime.substring(i,i+harf.length()).equalsIgnoreCase(harf)){
                count++;
            }
        }
        return count;
    }



//Kullanıcıdan bir kelime ve bir harf alın kelimenizin içinde bu harfin hepsi kaldırılmış şekilde string
// döndüren programı yazınız.
//(Merhaba, a) Merhb

    public static String eraseOfLetters(String word,String letter){
       return  word.replace(letter,"");

    }

   // Kullanıcıdan bir kelime alın ve kin kelimesi başından veya ilk karakterden sonra gelip gelmediğini kontrol edin
    // geliyorsa true gelmiyorsa false döndürün;
   // Kinlenmek true
    // Kin tutmak true
    // Ekin ektim true
    // Keskin ilçesinden geçiyorum false
    // Neden kin tutuyorsun false


     public static boolean controlSentence(String kelime,String control){
        if(kelime.substring(0,control.length()).equalsIgnoreCase(control) ||
                kelime.substring(1,1+control.length()).equalsIgnoreCase(control)){
            return true;

        }
        return false;
     }

}
