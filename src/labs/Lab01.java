package labs;

import java.util.Scanner;

public class Lab01 {

	
	
	public static void main(String[] args) {
		
		problem1();
		problem2();
		problem3();
		problem4();
		
		
	}
	
	
	public static void problem1() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("Enter a positive integer: ");
		int firstInt = inKey.nextInt();
		System.out.println("Enter another positive integer: ");
		int secInt = inKey.nextInt();
		
		System.out.println(firstInt + "^" + secInt + " = " + Math.pow(firstInt, secInt));
		
	}
	
	
	
	public static void problem2() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n\nEnter a positive number: ");
		int posNum = inKey.nextInt();
		
		System.out.println("The square root of " + posNum + " is " + Math.sqrt(posNum));
			
	}
	
	
	
	public static void problem3() {
		Scanner inKey = new Scanner(System.in);
		
		System.out.println("\n\nLength of side A: ");
		int sideA = inKey.nextInt();
		System.out.println("Length of side B:");
		int sideB = inKey.nextInt();
		
		double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));
		System.out.println("Hypotenuse = " + hypotenuse + "\n\n");
		
	}
	
	
	
	public static void problem4() {
		Scanner inKey = new Scanner(System.in);
		
		boolean zero = false;
		int userNum = 1;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while (userNum != 0) {
			System.out.println("Enter any number: ");
			userNum = inKey.nextInt();
			
			max = Math.max(max, userNum);
			min = Math.min(min, userNum);
			if (userNum == 0) {
				break;
			}
		}
		
		System.out.println("Max = " + max);
		System.out.println("Min = " + min);
	}
	
	
}
