package Day_34.staticClasses;

public class Outer {


    static class nested{
        public static void message(){
            System.out.println("selam static class dan");
        }

    }
    class inner{
        public void message(){
            System.out.println("selam inner class dan");
        }
    }
}
class main{
    public static void main(String[] args) {
        Outer.nested.message();

        Outer outer=new Outer();

        Outer.inner selam=outer.new inner();

 //       Outer.inner selam=new Outer().new inner();
        selam.message();
    }
}