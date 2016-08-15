import java.util.Scanner;

public class task2 {

	private static Scanner sc;

	public static void main(String[] args) {

		sc = new Scanner(System.in);

		System.out.println("insert a and b");

		int a;

		int b;

		a = sc.nextInt();

		b = sc.nextInt();

		int sum = a + b;

		int raz = a - b;

		int pr = a * b;

		int ch = a / b;

		int ch1 = a % b;

		System.out.println("suma= " + sum);

		System.out.println("razlika= " + raz);

		System.out.println("proizvedenie= " + pr);

		System.out.println("chastno= " + ch);

		System.out.println("ostatyk pri delenie= " + ch1);

	}

}
