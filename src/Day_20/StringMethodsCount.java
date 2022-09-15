package Day_20;

import java.util.Scanner;

public class StringMethodsCount {
    public static void main(String[] args) {
        //System.out.println(countY("javayı Seviyor muyum?"));

   // sesliHarf("javayı Seviyor muyum?");
       // childrenMessage();
       // lastThree("Metin");
        //withoutFirst("talip","tıraş");
        System.out.println(nickNameGen("abdurrahim", "göktekin"));
    }
/*
//"javayı Seviyor muyum?" ifadesindeki y harfinin sayısını veren bir program yazın.

    public static int countY(String str){
        int count=0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=="y"|| str.charAt()=="Y"){
                count++;

            }

        }

        return count;


    }

    //Aldığınız mesajın sesli harflerini a,e,i formatında konsola yazdırın.

    public static String sesliHarf(String str){
        String holder="";
        for (int i = 0; i <str.length() ; i++) {
            switch (str.charAt(i)){
                case "a":
                    holder+=str.charAt(i);
                    break;

                case "e":
                    holder+=str.charAt(i);
                    break;

                case "i":
                    holder+=str.charAt(i);
                    break;

                case "ü":
                    holder+=str.charAt(i);
                    break;
                default:
            }

        }

        return holder;
    }

//Kullanıcıdan çocuk bayramı ile ilgili bir cümle söylemesini isteyin cümle içinde sev köküne sahip bir kelime var ise
// bir method what a lovely person(ne hoş bir insan) mesajı döndürsün.

    public static String childrenMessage(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Mesajı girin: ");
        String message= scan.nextLine();
        System.out.println(message.contains("sev"));
        if (message.contains("sev")){
            System.out.println("sen iyi çocuksun");
        }


        return message;
    }
//İsminizin son 3 harfini 3 kez yazdıran bir method oluşturun.

    public static void lastThree(String str){
        String holder="";

        for (int i = 0; i <3 ; i++) {
           holder+= str.substring(str.length()-3);


        }
        System.out.println(holder);
    }
    public static void withoutFirst(String str1,String str2){
        String empty="";
        char birincininILkHarfi= str1.charAt(0);
        for (int i = 0; i < str2.length(); i++) {
            if(str2.charAt(i)!=birincininILkHarfi){
                empty+=str2.charAt(i);

            }
        }
        System.out.println(empty);
    }*/

    //4-İsminizin ilk 3 harfi ve soy isminizin son 3 harfi ile nickname oluşturan bir method yazın.

    public static String nickNameGen(String name,String surname){
       String nickName= name.substring(0,3).concat(surname.substring(surname.length()-3));
        return nickName;

    }
}
