package Day_17_Class_And_Object;

public class Main2 {
    public static void main(String[] args) {
        DaireNew daire_1=new DaireNew();
        daire_1.yariCap=10;
        DaireNew daire_2=new DaireNew();
        daire_2.yariCap=15;

        daire_1=daire_2;

        daire_2.yariCap=80;
        System.out.println("daire_1.yariCap = " + daire_1.yariCap);
    }
}
