package Day_35;

public class Human {
  public void name(){
   System.out.println("ismi ahmet olabilir");
  }

}
class Man extends Human{
 public void role(){

  System.out.println("baba olurlar");
 }
}
class Son extends Man{
 public void activitiy(){
  System.out.println("oyun oynar");
 }
}
class Test{
 public static void main(String[] args) {
   Son son =new Son();
   son.name();
   son.role();
   son.activitiy();

   Man man=new Man();
   man.name();
   man.role();
   //man activity();//erişemez
  Human human = new Human();
  human.name();
 // human.activity e erişemez
  //human.
 }
}