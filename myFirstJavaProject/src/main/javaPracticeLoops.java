package main;
import java.util.Scanner;

public class javaPracticeLoops {

	public static void main(String[] args) {
		
		int[] myNum = {3,13,4,11,9};
		
		 int sum = 0;
		    for(int i = 0; i < myNum.length; i++){
		        System.out.println(i);
		        sum+=myNum[i];
		    }
		    System.out.println(sum);

		//case example
/*		int day = 6;
		switch(day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Not a day idiot !");
		}*/
		
		//ternary operator
		/* (3==10) ? "yes" : "noe"; */
		
		//do while loop
		
		/*
		 * int count = 0; do { 
		 * System.out.println("count is " + count); count++;
		 * }while(count < 15);
		 */
		
		//for loop
		
//		for(int i =10; i > 0; i--) {
//			System.out.println("count is " + i );
//		}
		    
//		    //user input
//		    int n;
//		    Scanner myObj = new Scanner(System.in);
//		    System.out.println("How many elements in array");
//		    
//		    n = myObj.nextInt();

	}

}
