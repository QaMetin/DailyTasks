package Day_31_Constructor;

public class Constructor_Main {
    public static void main(String[] args) {
//        Flower flower=new Flower();
//        System.out.println(flower.renk);
//
//        flower.renk="kırmızı";
//        System.out.println(flower.renk);
//
//        flower.setRenk("sarı");
//        System.out.println(flower.renk);

        Okul yavuzSultanSelimIlkOkulu=new Okul();
        Okul kanuniOrtaOkulu=new Okul("pembe",550,50);
        Okul keskinIlkOkulu=new Okul("Beyaz",450,45);

        System.out.println(kanuniOrtaOkulu.kapasite);
        kanuniOrtaOkulu.kontrolKapasite();
        System.out.println(keskinIlkOkulu.kapasite);
        keskinIlkOkulu.kontrolKapasite();


    }
}
// Okul adında bir sınıf oluşturun
// fields: rengi; kapasite; sinifAdedi;
// methods: Kapasite>500 kapasite aşılmıştır ikazı versin. min 3 adet constructors yazın.