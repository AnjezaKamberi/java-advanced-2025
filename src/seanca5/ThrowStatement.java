package seanca5;

import java.util.ArrayList;
import java.util.List;

public class ThrowStatement {

    // throw - keyword qe perdoret per te hedhur nje exception ne nje pike te caktuar te programit tone

    public static void main(String[] args) {
        System.out.println("Filloj ekzekutimin e programit");
        try {
            List<Student> studentList = new ArrayList<>();
            Student student1 = new Student("Blerimi");
            studentList.add(student1);
            Student student2 = new Student("Arsen");
            studentList.add(student2);
            // gjej studentin me emer "Bjon"
            boolean uGjet = false;
            for (Student student : studentList) {
                System.out.println("Emri i studentit eshte " + student.getName());
                if ("Bjon".equals(student.getName())) {
                    System.out.println("Studenti Bjon ekziston ne regjistrin tone!");
                    uGjet = true;
                    break;
                }
            }

            if (!uGjet) {
                // hidh nje exception
                throw new StudentNotFoundException("Studenti me emer Bjon nuk gjendet");

            }
        } catch (Exception exception) {
            System.out.println("Ka ndodhur nje problem!");
            System.out.println("Problemi eshte : " + exception.getMessage());
        }
        System.out.println("Mbaroj ekzekutimin e programit");

    }

}
