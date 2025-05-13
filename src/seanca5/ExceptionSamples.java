package seanca5;

public class ExceptionSamples {

    public static void main(String[] args) {
        System.out.println("Filloj regjistrimin e studentit");
        Student student = new Student();
        student.setName("Blerimi");
        System.out.println("Emri i studentit eshte " + student.getName());
        student = null;
        student.setId(1L);
        System.out.println("Id ja e studentit eshte " + student.getId());
        System.out.println("Perfundova regjistrimin  e studentit");
    }
}
