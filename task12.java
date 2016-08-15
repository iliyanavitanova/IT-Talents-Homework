import java.util.Scanner;

public class task12 {
	private static Scanner sc;

	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		int day;
		
		int month;
		
		int year;
		
		System.out.println("today is:");
		
		day = sc.nextInt();
		
		month = sc.nextInt();
		
		year = sc.nextInt();
		
		int nextDay = 0;
		
		int nextMonth = 0;
		
		int nextYear = 0;
		
		if (month == 4 || month == 6 || month == 9 || month == 11) {
		
			if (day < 30) {
			
				{
				
					nextDay = day + 1;
					
					nextMonth = month;
					
					nextYear = year;
				
				}

			} else if (day == 30) {
				
				{
					nextDay = 1;
					
					nextMonth = month + 1;
					
					nextYear = year;
				
				}
				
			}

		} else if (month == 2) {
			
			if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
			
				if (day < 29) {
				
					nextDay = day + 1;
					
					nextMonth = month;
					
					nextYear = year;

				} else {
					
					nextDay = 1;
					
					nextMonth = month + 1;
					
					nextYear = year;
				
				}
				
			} else if (day < 28) {
				
				nextDay = day + 1;
				
				nextMonth = month;
				
				nextYear = year;

			} else {

				nextDay = 1;
				
				nextMonth = month + 1;
				
				nextYear = year;
			
			}
		
		}
		
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8) {
		
			if (day < 31) {
			
				nextDay = day + 1;
				
				nextMonth = month;
				
				nextYear = year;
				
			} else {
				
				nextDay = 1;
				
				nextMonth = month + 1;
				
				nextYear = year;
			
			}
		
		}
		
		if (month == 12)
		
			if (day < 31) {
			
				nextDay = day + 1;
				
				nextMonth = month;
				
				nextYear = year;
			
			} else {
			
				nextDay = 1;
				
				nextMonth = 1;
				
				nextYear = year + 1;
		
			}
		
		System.out.println("next date is: ");
		
		System.out.println(nextDay + "." + nextMonth + "." + nextYear);
	
	}

}
