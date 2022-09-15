package Day_15_Methods_2;

public class MethodReturnType {
    public static void main(String[] args) {
//        System.out.println(lastdijitCheck(124,444));
//        boolean bl=lastdijitCheck(235,55);
//        System.out.println("bl= "+bl);
//        lastdijitCheck(23,24);
//        System.out.println(primeNumber(49));
//        System.out.println(convertToPozitif(-5));
        System.out.println(gecmeNotu(101, 101, 99));

    }

    public static boolean lastdijitCheck(int sayi1, int sayi2) {
        if (sayi1 % 10 == sayi2 % 10) {
            return true;
        }
        return false;
    }

    public static boolean primeNumber(int num) {
        if (num == 0 || num == 1) {
            return false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int convertToPozitif(int a){
        return Math.abs(a);
    }

    public static char gecmeNotu(double not1,double not2,double not3) {

        double ortalama = (not1 + not2 + not3) / 3;
        char not='X';
        if (ortalama >= 76 && ortalama < 100) {
            not= 'A';
            return 'A';
        } else if (ortalama >= 51 && ortalama < 76) {
            not='B';
            return 'B';
        } else if (ortalama >= 0 && ortalama < 51) {
            not='C';
            return 'C';
        }else {
          not='X';
        }
        return not;
    }



}
