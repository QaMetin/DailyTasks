package Day_34.staticVariable;

import Day_34.Student1;

public class StudentTest {
    public static void main(String[] args) {
        Student1 student1=new Student1("Can");
        Student1 student2=new Student1("İhsan");

        student1.printName();
        student2.printName();
    }
}
