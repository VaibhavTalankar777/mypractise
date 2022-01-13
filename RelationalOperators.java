package javabasics;

public class RelationalOperators {

	public static void main(String[] args) {
		// Relational Operators : == != > < >= <=
        // Logical Operators : ! && ||

        int age = 6;

        if ((age >= 5) && (age <= 6)){

            System.out.println("Go to Kindergarden");

        } else if ((age >= 7) && (age <= 13)){

            System.out.println("Go to Middle School");

        } else if ((age >= 14) && (age <= 18)){

            System.out.println("Go to High School");

        } else {

            System.out.println("Stay Home");
        }

	
	System.out.println("true || false = " + (true || false));
    System.out.println("!true = " + (!true));

    // The ternary operator returns the 1st value
    // when the condition is true and the 2nd
    // otherwise
    boolean canVote = (age >= 18) ? true : false;
    System.out.println("Can Vote : " + canVote);
	}
}
