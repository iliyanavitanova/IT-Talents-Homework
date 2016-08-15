import java.util.Scanner;

public class task8 {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		short a;

		System.out.println("a=");

		a = sc.nextShort();

		if (a < 1000 || a > 9999)

			System.out.println("ERROR");

		short b;

		short c;

		short e, d, s, h;

		e = (short) (a % 10);

		d = (short) (a / 10 % 10);

		s = (short) (a / 100 % 10);

		h = (short) (a / 1000 % 10);

		b = (short) (h * 10 + e);

		c = (short) (s * 10 + d);

		if (b < c)
			System.out.println("less (" + b + "<" + c + ")");

		else if (b == c)
			System.out.println("equal (" + b + "=" + c + ")");

		else
			System.out.println("larger (" + b + ">" + c + ")");
	}
}
