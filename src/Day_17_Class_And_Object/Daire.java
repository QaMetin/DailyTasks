package Day_17_Class_And_Object;

public class Daire {
    final double PI=3.14;
    int cap;


    public double alanHesapla1(){
      int yariCap=cap/2;

      double sonuc=PI*(cap/2)*(cap/2);
      return sonuc;

    }
    public double cevreHesapla() {
        int yariCap=cap/2;
        double sonuc = 2 * PI * cap/2;
        return sonuc;
    }

    public static double alanHesapla(int r){


        double sonuc=3.14*r*r;
        return sonuc;

    }
}
