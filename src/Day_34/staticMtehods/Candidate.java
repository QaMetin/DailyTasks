package Day_34.staticMtehods;

public class Candidate {
    String name;
    int schoolID;

    static String branch;
    static int counter;

    public Candidate(String name) {
        this.name = name;
        schoolID = setNumber();
    }

    public static int setNumber() {
        counter++;
        return counter;

    }

    public static void setBranch(String str) {
        branch = str;

    }
    public void getInfo(){
        System.out.println(name);
        System.out.println(branch);
        System.out.println(schoolID);
    }

}
class main3{
    public static void main(String[] args) {
        Candidate cd1=new Candidate("Beytullah");
        Candidate cd2=new Candidate("Alparslan");
        Candidate cd3=new Candidate("yaşar");
        Candidate.setBranch("Selenium");
        cd1.getInfo();
        cd2.getInfo();
        cd3.getInfo();
    }
}