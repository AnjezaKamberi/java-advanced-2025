package exceptions;

public class TryCatchFinallySample {

	public static void main(String[] args) {

		System.out.println("Do kryej disa veprime matematikore");

		try {
			ExceptionSamples.gjeneroArithmeticException(5, 5);
			ExceptionSamples.gjeneroArithmeticException(5, 0);
			ExceptionSamples.gjeneroArithmeticException(2, 2);
		} catch (NullPointerException e) {
			System.out.println("Kujdes! Nuk lejohet pjesetimi me 0");
		} finally {
			System.out.println("Jam ne mbarim te veprimeve matematikore");
		}

		System.out.println("Perfundova me veprimet matematikore");

	}
}
