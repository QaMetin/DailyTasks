package Day_35;

import java.util.Scanner;

public class GameActivitiyTest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
 //kullanıcaıdan kaç hedefle karşılaştığını ve kaçını vurduğunu sorun verdiği cevaba göre rank ini tespit edin.

        System.out.println("Kaç hedefle karşılaştın : ");
        int düşman= scan.nextInt();
        System.out.println("Kaçını vurdun : ");
        int isabet= scan.nextInt();
        Challenge challenge=new Challenge(düşman,isabet);
        System.out.println(challenge.getScore());
        System.out.println(challenge.getRank());
    }
}
