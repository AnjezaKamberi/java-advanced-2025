package seanca5;

import java.util.ArrayList;
import java.util.List;

public class TryCatchStatement {

    public static void main(String[] args) {
        System.out.println("Filloj ekzekutimin e programit");
        // try - BLLOK KODI cdo statement qe ekziston mundesia qe te hedh nje exception
        // catch - BLLOK KODI handle, menaxhon raste te ndryshme te exceptionave qe hidhen brenda bllokut try me te cilin ky bllok eshte i lidhur
        try {
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
        } catch (NullPointerException exception) { // parameter - tipi i exceptionit qe dua te bej handle
            System.out.println("Ka ndodhur nje problem me referencen NULL!");
        } catch (ArithmeticException exception) {
            System.out.println("Ka ndodhur nje problem aritmetik");
        } catch (Exception exception) {
            System.out.println("Ka ndodhur nje problem!");
        }


        System.out.println("Mbaroj ekzekutimin e programit");

    }
}
