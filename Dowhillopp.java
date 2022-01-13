package javabasics;

import java.util.Scanner;

public class Dowhillopp {

	public static void main(String[] args) {
		 // Do whiles execute at least once
        Scanner sc = new Scanner(System.in);   
        int secretNum = 7;
        int guess = 0;
        do {
            System.out.println("Guess : ");
            if(sc.hasNextInt()){
                guess = sc.nextInt();
            }
        }while(secretNum != guess);

        System.out.println("You guessed it");
        sc.close();

	}

}
