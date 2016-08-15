import java.util.Scanner;

public class task1 {

	private static Scanner sc;

	public static void main(String[] args) {

		System.out.println("a=");

		double a;

		System.out.println("b=");

		double b;

		sc = new Scanner(System.in);

		a = sc.nextDouble();

		b = sc.nextDouble();

		System.out.println("c=");

		double c;

		c = sc.nextDouble();

		if (a < c && c < b)
			
			System.out.println("A<C<B");

		else
			System.out.println("A<C<B is false");

	}
}
