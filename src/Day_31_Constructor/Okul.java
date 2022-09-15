package Day_31_Constructor;

public class Okul {
    // Okul adında bir sınıf oluşturun
// fields: rengi; kapasite; sinifAdedi;
// methods: Kapasite>500 kapasite aşılmıştır ikazı versin. min 3 adet constructors yazın.
    public String renk;
    public int kapasite;
    public int sinifAdeti;

    public Okul(){

    }
    public Okul(String renk){
        this.renk=renk;

    }
    public Okul(String renk,int kapasite){

        this.renk=renk;
        this.kapasite=kapasite;

    }
    public Okul(String renk,int kapasite,int sinifAdeti){
        this.renk=renk;
        this.kapasite=kapasite;
        this.sinifAdeti=sinifAdeti;

    }
    public void kontrolKapasite(){
        if (this.kapasite>500){
            System.out.println("kapasite aşılmıştır");
        }else{
            System.out.println("kapasite aşılmasına " + (500 - this.kapasite) + " kişi kalmıştır");
        }
    }

}
