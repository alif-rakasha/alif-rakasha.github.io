package controlStatementProject;

import java.util.Scanner;
public class leapYearCalculator {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("  Leap Year Calculator  ");
		System.out.println("------------------------");
		System.out.println("Enter a number of Month (1-12): ");
		int month = input.nextInt();
		System.out.println("Enter a number of Year: ");
		int year = input.nextInt();
		
		//Ternary Operator
		String result = month%2 == 0 ? "Even" : "Odd";
		System.out.println("\n"+month+" is an "+result+" number.");
		
		//IF-ELSE
		boolean leap;
		if(((year % 4 == 0) && !(year % 100 == 0)) || 
		(year % 400 == 0))
			leap = true;
		else
			leap = false;
		
		//Switch-Case
		String monthname = "";
		int days = 0;
		switch(month) {
		case 1 :
			monthname = "January";
			days = 31;
			break;
		case 3 :
			monthname = "March";
			days = 31;
			break;
		case 5 :
			monthname = "May";
			days = 31;
			break;
		case 7 :
			monthname = "July";
			days = 31;
			break;
		case 8 :
			monthname = "August";
			days = 31;
			break;
		case 10 :
			monthname = "October";
			days = 31;
			break;
		case 12 :
			monthname = "December";
			days = 31;
			break;
		case 4 :
			monthname = "April";
			days = 30;
			break;
		case 6 :
			monthname = "June";
			days = 30;
			break;
		case 9 :
			monthname = "September";
			days = 30;
			break;
		case 11 :
			monthname = "November";
			days = 30;
			break;
		case 2 :
			monthname = "February";
			//IF-ELSE
			if(leap == true)
				days = 29;
			else
				days = 28;
			break;
		default :
			System.out.println("Invalid Input");
		}
		
		System.out.println(monthname+" of "+year+" has "+days+" days.");
	}

}

