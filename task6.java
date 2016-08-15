import java.util.Scanner;

public class task6 {
	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		double a1;

		double a2;

		double a3;

		double temp;

		System.out.println("a1=");

		a1 = sc.nextDouble();

		System.out.println("a2=");

		a2 = sc.nextDouble();

		System.out.println("a3=");

		a3 = sc.nextDouble();

		temp = a1;

		a1 = a2;

		a2 = a3;

		a3 = temp;

		System.out.println("a1= " + a1);

		System.out.println("a2= " + a2);

		System.out.println("a3= " + a3);

	}

}
