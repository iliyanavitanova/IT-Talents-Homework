import java.util.Scanner;

public class task2_1 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		double a;

		double b;

		System.out.println("a=");

		a = sc.nextDouble();

		System.out.println("b=");

		b = sc.nextDouble();

		double sum = a + b;

		double raz = a - b;

		double pr = a * b;

		double ch = a / b;

		double ch1 = a % b;

		System.out.println("suma= " + sum);

		System.out.println("razlika= " + raz);

		System.out.println("proizvedenie= " + pr);

		System.out.println("chastno= " + ch);

		System.out.println("ostatyk pri delenie= " + ch1);

	}

}