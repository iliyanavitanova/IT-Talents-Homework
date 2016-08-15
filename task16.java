import java.util.Scanner;

public class task16 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		short x;

		System.out.println("input x: ");

		x = sc.nextShort();

		if (x < 100 || x > 999)

			System.out.println("ERROR");

		byte a = (byte) (x % 10);

		byte b = (byte) (x / 10 % 10);

		byte c = (byte) (x / 100 % 10);

		if (a == b && b == c)

			System.out.println("ravni");

		else if (a > b && b > c)

			System.out.println("nizhodqsht red");

		else if (a < b && b < c)

			System.out.println("wyzhodqsht red");

		else

			System.out.println("cifrite sa nenaredeni");
	}

}
