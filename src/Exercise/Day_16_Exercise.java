package Exercise;

import java.util.Scanner;

public class Day_16_Exercise {
    public static void main(String[] args) {
        System.out.println(fillWithDot(" "));

    }
    public static String fillWithDot(String kelime){

        String result;
        String dot=".....";
        if (kelime.length()<5) {
            result=kelime+dot.substring(0,5-kelime.length());
            System.out.println(result);

        }else{
            System.out.println(kelime.substring(0, 5));
        }

        return "";
    }
}
