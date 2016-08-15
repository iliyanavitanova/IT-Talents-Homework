import java.util.Scanner;

public class task15 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		byte a;

		System.out.println("Hour");

		a = sc.nextByte();

		if (a > 4 && a <= 9)

			System.out.println("good morning");

		else if (a > 9 && a <= 18)

			System.out.println("good day");

		else if (a > 18 && a <= 24 || a >= 0 && a <= 4)

			System.out.println("good night");

		else if (a < 0 || a > 24)

			System.out.println("ERROR");

	}
}
