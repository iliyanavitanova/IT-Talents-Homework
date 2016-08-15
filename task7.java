import java.util.Scanner;

public class task7 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int hour;
		
		double money;
		
		boolean sick;
		
		System.out.println("hour: ");
		
		hour = sc.nextInt();
		
		System.out.println("money: ");
		
		money = sc.nextDouble();
		
		System.out.println("sick: ");
		
		sick = sc.nextBoolean();
		
		if (sick) {
		
			System.out.println("i won't go out ");
			
			if (money != 0)
			
				System.out.println("i will buy medicine");
			
			else
				
				System.out.println("i am going to stay at home and drink tea ");
			
		} else if (money > 10)
			
			System.out.println("i go to the cinema with friends");
		
		else
		
			System.out.println("i will drink coffee");
	
	}

}
