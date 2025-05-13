package exceptions;

public class TryMultipleCatchSample {

	public static void main(String[] args) {

		System.out.println("Do kryej disa veprime matematikore");
		try {
			ExceptionSamples.gjeneroArithmeticException(5, 5);
			ExceptionSamples.gjeneroNullPointerException();
			ExceptionSamples.gjeneroInputMismatchException();
		} catch (ArithmeticException exception) {
			System.out.println("Kujdes! Nuk lejohet pjesetimi me 0");
		} catch (NullPointerException exception) {
			System.out.println("Ndodhi nje problem me leximin e te dhenave te painicializuara");
		} catch (Exception exception) {
			System.out.println("Ndodhi nje problem!Duhet verifikuar.");
		}

		System.out.println("Perfundova me veprimet matematikore");

	}
}
