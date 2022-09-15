package Day_17_Class_And_Object;

public class Main {
    public static void main(String[] args) {
        Person ogrenci_1=new Person();
        ogrenci_1.isim="Harun";
        ogrenci_1.cinsiyet="Erkek";
        ogrenci_1.yas=18;
        Person ogrenci_2=new Person();
        ogrenci_2.isim="Ayşe";
        ogrenci_2.cinsiyet="Bayan";
        ogrenci_2.yas=16;
//        ogrenci_1.oyunOyna();
//        ogrenci_1.uyu();
//        System.out.println(ogrenci_1.isim+" ile "+ogrenci_2.isim+" arkadaştır");
//        System.out.println(ogrenci_1.isim+" yaşı: "+ogrenci_1.yas);



        Dog dog_1=new Dog();
        dog_1.cins="Sivas Kangalı";
        dog_1.renk="Siyah";
        dog_1.isim="Karabaş";



//        System.out.println(dog_1.isim+" adlı köpeğin rengi "+dog_1.renk);
//        dog_1.havla();
//        dog_1.uyu();
//        System.out.println(dog_1.yemekYe());

/*        Car tesla_1=new Car();
        tesla_1.hiz=360;
        tesla_1.renk="sarı";
        tesla_1.marka="Tesla";
        tesla_1.model="Model 3";
        tesla_1.calistir();
        tesla_1.hizlan();
        tesla_1.dur();
        System.out.println("tesla_1.model = " + tesla_1.model);


        Daire daire_1=new Daire();
        daire_1.cap=8;
        System.out.println("dairemizin alanı = " + daire_1.alanHesapla());

        Daire daire_2=new Daire();
        daire_2.cap=7;
        System.out.println("daire_2.cevreHesapla() = " + daire_2.cevreHesapla());
        System.out.println("daire_2.cap = " + daire_2.cap);

        System.out.println("Math2.pow(2,6) = " + Math2.pow(2, 6));

        System.out.println("Daire.alanHesapla(3) = " + Daire.alanHesapla(3));*/

        Banka person_1=new Banka();
        person_1.hesapAc();
        person_1.mobilBankacilikOnay();
        person_1.paraYatir(50);
        person_1.paraYatir(150);


        Banka person_2=new Banka();
        person_2.hesapAc();
        person_2.mobilBankacilikOnay();
        person_2.paraYatir(188);

        person_1.hesapOzeti();
        person_2.hesapOzeti();





    }

}
