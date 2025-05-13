package seanca5;

import java.util.ArrayList;
import java.util.List;

public class TryFinallyStatement {

    public static void main(String[] args) {
        System.out.println("Filloj ekzekutimin e programit");
        // finally - BLLOK KODI qe ekzekutohet ne cdo rast, nese kemi nje exception, por edhe nese nuk kemi nje te tille
        try { // LEXO TRY WITH RESOURCES IN JAVA
            List<Student> studentList = new ArrayList<>();
            Student student1 = new Student("Blerimi");
            studentList.add(student1);
            Student student2 = new Student();
            studentList.add(student2);
            Student student3 = null;
            studentList.add(student3);
            System.out.println("Numri i studenteve eshte:  " + studentList.size());
            for (Student student : studentList) {
                System.out.println("Emri i studentit eshte " + student.getName());
            }
        } catch (Exception exception) {
            System.out.println("Ndodhi nje problem");
//            System.exit(0);
        } finally {
            System.out.println("Ekzekutohet 'gjithmone'!");
        }


        System.out.println("Mbaroj ekzekutimin e programit");
    }
}
