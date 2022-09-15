package Day_19_String;

public class StringMethods {
    public static void main(String[] args) {
      /*  String str="Persembe";
        String str2="";
        System.out.println(str2.length());



        //System.out.println(str.length());
      //  int i=str.length();
      //  System.out.println(i);
        String str3="Persembe ve Cuma gunLERı";
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());

        System.out.println("str.charAt(7) = " + str.charAt(7));
        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(7) = " + str.charAt(str.length()-1));
        System.out.println("str.charAt(6) = " + str.charAt(str.length()-2));

        char ch=str.charAt(0);

        System.out.println("ch = " + ch);
*/

        String str5="Selam arkadaşlar ";
        String str6="nasılsınız";
        System.out.println("str5.concat(str6) = " + str5.concat(str6));
        String concat=str5.concat(str6);
        System.out.println("concat = " + concat);

// Task sınıfındaki bir methodu çağırma
        Tasks ts=new Tasks();
        System.out.println(Tasks.trimmed("  fghjfj   "));


    }

}
