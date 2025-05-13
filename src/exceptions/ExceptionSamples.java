package exceptions;

import java.util.*;

public class ExceptionSamples {

	public static double gjeneroArithmeticException(int numer1, int numer2) {
		System.out.println("Do kryej pjesetimin mes dy numrave");
		double rezultat = numer1 / numer2;
		System.out.println("Rezultati eshte " + rezultat);
		return rezultat;
	}

	public static void gjeneroInputMismatchException() {
		Scanner input = new Scanner(System.in);
		System.out.println("Me jep moshen tende ");
		int mosha = input.nextInt();
		System.out.println("Mosha e dhene nga ju eshte " + mosha);
		input.close();
	}

	public static void gjeneroArrayIndexOutOfBoundsException() {
		List<String> kurse = List.of("JAVA", "C#");
		System.out.println("Kursi i trete qe zhvillohet ne akademine ikubinfo eshte " + kurse.get(2));
		System.out.println("Ju presim per regjistrime");
	}

	public static void gjeneroNullPointerException() {
		Student student = new Student("Rea");
		System.out.println("Emri i studentit eshte " + student.getEmer());
		System.out.println("Do vendosim te dhena te tjera per studentin");
		student = null;
		System.out.println("Emri i studentit eshte " + student.getEmer());
	}
}
