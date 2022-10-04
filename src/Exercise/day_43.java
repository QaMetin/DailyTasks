package Exercise;

import java.util.Scanner;

public class day_43 {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);


        System.out.print("Aranacak kelimeyi giriniz : ");
        String kelime=scan.nextLine();

        System.out.print("Cümleyi giriniz : ");
        String cumle=scan.nextLine(); */

        Scanner scan = new Scanner(System.in);
        System.out.println("Cümleyi giriniz : ");
        String str = scan.nextLine();




        if(str.substring(0,1).equalsIgnoreCase("a")){
            int fillIndex1=str.indexOf(" ");
            System.out.println(str.substring(0, fillIndex1));
        }else{
            int firstindex=(str.toLowerCase().indexOf(" a"))+1;
            String str2=str.substring(firstindex);
            int fillIndex=str2.indexOf(" ");
            System.out.println(str2.substring(0,fillIndex));
        }



    }

}
