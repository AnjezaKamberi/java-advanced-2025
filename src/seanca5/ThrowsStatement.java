package seanca5;

import java.util.ArrayList;
import java.util.List;

public class ThrowsStatement {

    // zgjidhja 2
    public static void main(String[] args) throws StudentNotFoundException {
//        // zgjidhja 1
//        try {
//            kerkoStudent();
//        } catch (StudentNotFoundException exception) {
//            System.out.println("Nje student nuk u gjet");
//        }

        kerkoStudent();
    }

//    throws - 'paralajmeron' mbi mundesine e nje exception ne nje metode, NUK  e ben handle exceptionin specifik


    public static void kerkoStudent() throws StudentNotFoundException {
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
    }

}
