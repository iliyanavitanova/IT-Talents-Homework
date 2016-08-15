import java.util.Scanner;

public class task9 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		byte a, b;

		System.out.println("a=");

		a = sc.nextByte();

		System.out.println("b=");

		b = sc.nextByte();

		if (a < 10 || b < 10 || a > 99 || b > 99)

			System.out.println("ERROR");

		int pr = a * b;

		System.out.println(pr);

		if (pr % 2 == 0)
			System.out.println(pr % 10 + " an even number");

		else
			System.out.println(pr % 10 + " an odd number");

	}
}
