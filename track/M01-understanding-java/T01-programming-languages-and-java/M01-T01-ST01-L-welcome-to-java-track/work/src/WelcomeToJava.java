import java.util.*;

class Student{
    int id;
    String name;
    String course;
    double javaScore;
}
public class WelcomeToJava {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        Student a=new Student();

        s.id=sc.nextInt();
        s.name=sc.next();
        s.course=sc.next();
        s.javaScore = sc.nextDouble();

        a.id=sc.nextInt();
        a.name=sc.next();
        a.course=sc.next();
        a.javaScore = sc.nextDouble();


        System.out.println("Student Profile");
        System.out.println("ID: "+s.id);
        System.out.println("Name : "+s.name);
        System.out.println("Course: "+s.course);
        System.out.println("Java Score: "+s.javaScore);

        System.out.println("Student Profile");
        System.out.println("ID: "+a.id);
        System.out.println("Name : "+a.name);
        System.out.println("Course: "+a.course);
        System.out.println("Java Score: "+a.javaScore);
         }
}

