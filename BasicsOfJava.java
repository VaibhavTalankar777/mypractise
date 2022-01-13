package javabasics;

import java.util.Scanner;

public class BasicsOfJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single line commment
		
		System.out.println("Hey there!How are you today!");    //printing on console 

	//Reading from console using Scanner Class
		
		System.out.println("what is your name? ");
	Scanner userInput =new Scanner(System.in);
	
	String name=userInput.next();
	 
	System.out.println("welcome " +name+ "!");
	
	
	//  escape sequenses    ///
	System.out.println("This is new line \n escape sequese \n ");
	System.out.println("This is tab \t\t escape sequesnce\n");
	System.out.println("This is quote \" escape sequesnce");
	
	}

}
 