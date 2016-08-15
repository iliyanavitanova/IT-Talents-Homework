import java.util.Scanner;

public class task13 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("celzii:");

		byte a;

		a = sc.nextByte();

		if (a <= -20)

			System.out.println("icy cold");

		else if (a > -20 && a < 0)

			System.out.println("cold");

		else if (a >= 0 && a < 15)

			System.out.println("cool");

		else if (a >= 15 && a < 25)

			System.out.println("warm");

		else if (a >= 25)

			System.out.println("hot");

	}

}
