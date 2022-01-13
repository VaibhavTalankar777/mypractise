package javabasics;

public class WhileLopp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// while loops as long as a condition is true
        int wI = 0;
        while (wI < 20) {

            // Only print even numbers
            if(wI % 2 == 0) {
                System.out.println(wI);
                wI++;
                // Jump back to the beginning of loop
                continue;
            }
            if(wI >= 10) {
                // Stop looping
                break;
            }
            wI++;
        }
	}

}
