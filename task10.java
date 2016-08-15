import java.util.Scanner;

public class task10 {
	
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		int l;

		System.out.println("l=");

		l = sc.nextInt();

		int br = 0;

		int br2 = 0;

		int br3 = 0;

		int ost = 0;

		ost = l % 5;

		br = l / 5;

		if (ost % 3 == 0) {

			br3 = ost / 3;

			ost = ost % 3;
		}

		if (ost % 2 == 0) {

			br2 = ost / 2;

			ost = ost % 2;

		}

		System.out.println(br + " puti po 2 l " + br + " puti po 3 l ");

		if (br2 != 0)

			System.out.println("dopulnitelno " + br2 + "kofi ot po 2 l");

		if (br3 != 0)

			System.out.println("dopulnitelno " + br3 + " kofi ot po 3 l");

		if (ost != 0)

			System.out.println("ostatuk ot " + ost + " l");

	}

}
