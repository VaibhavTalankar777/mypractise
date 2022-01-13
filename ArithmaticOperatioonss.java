package javabasics;

public class ArithmaticOperatioonss {

	public static void main(String[] args) {
		
	
	  int sumOfNumbers = 5 + 1;

		System.out.println("5 + 1 = " + sumOfNumbers);

		int diffOfNumbers = 5 - 1;

		System.out.println("5 - 1 = " + diffOfNumbers);

		int multOfNumbers = 5 * 1;

		System.out.println("5 * 1 = " + multOfNumbers);

		int divOfNumbers = 5 / 1;

		System.out.println("5 / 1 = " + divOfNumbers);

	    int modOfNumbers = 5 % 3;

		System.out.println("5 % 3 = " + modOfNumbers);

		// Random number between 5 and 20
		int minNum = 5;

		int maxNum = 20;

	int randNum = minNum + (int)(Math.random() *((maxNum - minNum) + 1));

	System.out.println("Rand : "+randNum);



	}

}
