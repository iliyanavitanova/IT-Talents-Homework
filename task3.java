import java.util.Scanner;

public class task3 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		double a;

		double b;

		double temp;

		System.out.println("a=");

		a = sc.nextDouble();

		System.out.println("b=");

		b = sc.nextDouble();

		temp = a;

		a = b;

		b = temp;

		System.out.println("swap a and b: ");

		System.out.println(a);

		System.out.println(b);
	}

}
