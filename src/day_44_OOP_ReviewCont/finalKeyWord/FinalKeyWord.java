package day_44_OOP_ReviewCont.finalKeyWord;

public class FinalKeyWord {
 static final int f=5; //1
 final int n;
 final int l;
 static final int sl;

    public  FinalKeyWord() { //2
        n=20;
        System.out.println("from constructor "+ n);

    }

    {
        l=30; //3
        System.out.println("from constructor "+ l);
    }

    static {
        sl=40;
        System.out.println("static block run");
    }

}

class run{
    public static void main(String[] args) {
        FinalKeyWord finalKeyWord=new FinalKeyWord();
        System.out.println("------------------------");
        FinalKeyWord finalKeyWord2=new FinalKeyWord();
    }
}
