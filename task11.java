import java.util.Scanner;

public class task11 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("a=");

		short a;

		a = sc.nextShort();

		byte e, d, s;

		e = (byte) (a % 10);
		if (e == 0)
			System.out.println("incorect input");

		d = (byte) (a / 10 % 10);
		if (d == 0)
			System.out.println("incorect input");

		s = (byte) (a / 100 % 10);
		if (s == 0)
			System.out.println("incorect input");

		if (a % e == 0 && a % d == 0 && a % s == 0)
			System.out.println("yes");

		else
			System.out.println("no");

	}

}
