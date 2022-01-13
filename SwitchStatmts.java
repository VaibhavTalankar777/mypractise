package javabasics;

public class SwitchStatmts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Switch is used when you have limited options
        String lang = "Hindi";

        switch(lang) {
        case "Chile": case "Cuba":
            System.out.println("Hola");

            // Without break the next condition
            // is checked
            break;

        case "France":
            System.out.println("Bonjour");
            break;


        case "Japan":
            System.out.println("Konnichiwa");
            break;

        default:
        	System.out.println("Hello");
        }
	}

}
