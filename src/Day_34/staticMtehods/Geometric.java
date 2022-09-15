package Day_34.staticMtehods;

import java.util.Random;

public class Geometric {
    static int primeter;
    static int counterSides;
    public static void setPrimeter(int...sides){
        for (int i:sides){
            primeter+=i;
            counterSides++;

        }
        System.out.println("Geometrik şeklin çevresi= "+primeter);
        System.out.println("Geometrik şeklin kenar sayısı = " + counterSides);
    }
}class main2{
    public static void main(String[] args) {
        Geometric.setPrimeter(generateSide(),generateSide(),generateSide(),generateSide());

    }
    public static int generateSide(){
        Random rm=new Random();
        return rm.nextInt(10);
    }
}
