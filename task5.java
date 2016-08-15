import java.util.Scanner;

public class task5 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		double a;

		double b;

		double c;

		System.out.println("a=");

		a = sc.nextDouble();

		System.out.println("b=");

		b = sc.nextDouble();

		System.out.println("c=");

		c = sc.nextDouble();

		if (a <= b && a <= c) {

			System.out.println(a);

			if (b < c) {

				System.out.println(b);

				System.out.println(c);

			} else {

				System.out.println(c);

				System.out.println(b);
			}

		} else if (b <= a && b <= c) {

			System.out.println(b);

			if (a < c) {

				System.out.println(a);

				System.out.println(c);

			} else {

				System.out.println(c);

				System.out.println(a);

			}

		} else if (c <= a && c <= b) {

			System.out.println(c);

			if (a < b) {

				System.out.println(a);

				System.out.println(b);

			} else {
				
				System.out.println(b);

				System.out.println(a);

			}

		}

	}

}
