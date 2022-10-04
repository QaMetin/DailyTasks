package Exercise;

public class day_42 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {

            for (int k = i + 1; k <= 7; k++) {
                System.out.print("1");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }


}
