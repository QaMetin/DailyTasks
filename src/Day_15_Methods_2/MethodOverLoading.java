package Day_15_Methods_2;

public class MethodOverLoading {
    public static void main(String[] args) {

//        calculateArea(3,9);
//        calculateArea(3);
        concat(5,"metin",false);
    }

    public static void calculateArea(int a,int b){
        System.out.println(a * b);
    }
    public static void calculateArea(int b){
        int r;
        double PI=3.14;
         r=b;
        System.out.println(PI*r*r);


    }

    public static void concat(int i,String str,boolean bl){

        if (bl){
            System.out.println(str + i);
        }else {
            concat(str,i); //Bir method çağıracağım
        }


    }
    public static void concat(String kelime,int c){
        for (int t = 0; t < c; t++) {
            System.out.println(kelime);
        }
    }


}
