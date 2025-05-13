package exceptions;

import java.util.ArrayList;
import java.util.List;

public class MainThrowThrows {

	public static void main(String[] args) {

		List<Student> studente = new ArrayList<>();
		studente.add(new Student("Rea"));
		//studente.add(null);
		studente.add(new Student("Erti"));
		
		try {
			gjejStudent(studente, "Bledi");
		} catch (StudentNotFoundException exception) {
			System.out.println(exception.getMessage());
		}
		
	}

	private static void gjejStudent(List<Student> studente, String emer) throws StudentNotFoundException {

		boolean found = false;

		for (Student student : studente) {

			if (student.getEmer().equalsIgnoreCase(emer)) {
				found = true;
				break;
			}

			System.out.println("Emri i studentit qe lexove eshte " + student.getEmer());
		}

		if (found) {
			System.out.println("Studenti " + emer + " u gjet");
		} else {
			throw new StudentNotFoundException("Studenti nuk gjendet!");
		}
	}
}
