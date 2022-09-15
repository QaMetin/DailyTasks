package Day_19_String;

import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
/*
        String str= scan.nextLine();
        System.out.println("counterOfChar() = " + counterOfChar());
        System.out.println("fullNameLength() = " + fullNameLength());
        System.out.println(fullNameUpper());
        System.out.println("lastindex() = " + lastindex());
        altAlta();*/
        String str8="   Selam Arkadaşlar  ";
       /* System.out.println(str8.contains(" A"));
        System.out.println(str8);
        System.out.println(str8.trim());
        System.out.println(str8.trim().replace("Selam", "Merhaba"));
        //System.out.println(str8.indexOf("a"));
        System.out.println(trimmed("       Metin   "));
        System.out.println(dateStamp("18/08/2022 21:32:35"));*/
        kelimeindex();

    }
    public static int counterOfChar(String str){
        return str.length();
    }

    public static int fullNameLength(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
             return(s1.concat(s2)).length();
    }
    public static String fullNameUpper(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();


        return s1.toUpperCase().concat("\n "+s2.toUpperCase());
    }
    public static char lastindex(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();



        return s1.charAt(s1.length()-1);
    }
    public static void altAlta(){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        for (int i=0;i<s1.length();i++){
            System.out.println(s1.charAt(i));
        }



    }
    public static String trimmed(String str){

        return str.trim();
    }
// 18/08/2022 21:32:35
    public static String dateStamp(String str){

        String replace=str.replace("/","");
        String replace1=replace.replace(" ","");
        return replace1.replace(":","");

    }
    public static int kelimeindex(){
        String str1="araba";
        String str2="aks";
         return (str2.indexOf(str1.charAt(0)));


    }


}
