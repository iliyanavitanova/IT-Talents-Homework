import java.util.Scanner;

public class task14 {
	
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		byte x1;
		
		byte y1;
		
		byte x2;
		
		byte y2;
		
		System.out.println("A:");
		
		x1 = sc.nextByte();
		
		y1 = sc.nextByte();
		
		System.out.println("B:");
		
		x2 = sc.nextByte();
		
		y2 = sc.nextByte();
		
		if ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0)
		
			System.out.println("yes");
		
		else if ((x1 + y1) % 2 != 0 && (x2 + y2) % 2 != 0)
		
			System.out.println("yes");
		
		if ((x1 + y1) % 2 != 0 && (x2 + y2) % 2 == 0)
		
			System.out.println("no");
		
		else if ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 != 0)
		
			System.out.println("no");

	}
}
