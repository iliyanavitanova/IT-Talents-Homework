import java.util.Scanner;

public class task4 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		double a;

		double b;

		System.out.println("a=");

		a = sc.nextDouble();

		System.out.println("b=");

		b = sc.nextDouble();

		if (a < b) {
			
			System.out.println(a);

			System.out.println(b);

		} else {
			
			System.out.println(b);
			
			System.out.println(a);
		}

	}
}
