package javabasics;

public class StringOperations {

	public static void main(String[] args) {
		
		//String Declaration
		String fname ="Vaibhav";
		System.out.println(fname);
		
		//combining string with + or +=
		
		String Fullname= fname +"Talankar ";
		System.out.println(Fullname +=" is my name ");	
		
		//conversion is automatic when using primitives
		String Dog ="K" + 9;
		System.out.println(Dog);
		
		
		//get char at index
		System.out.println(Fullname.charAt(0));
		
		//Does it contains a Vaibhav
		System.out.println(Fullname.contains("Vaibhav "));
		
		//get index of match
		System.out.println(Fullname.indexOf(" Talankar "));
		
		//Number of characters
		System.out.println(Fullname.length());
		
		
		//Replace matches
		//replace first 
		System.out.println(Fullname.replace("Vaibhav","VIBES"));
		
		//GET STRING AT INDEXES
		System.out.println(Fullname.substring(0,5));
		
		//compares to if equals output ==1 ; if output is +ve number means x times greater 
		//& if output is -ve number means x times smaller
		System.out.println(Fullname.compareTo("ABC"));
		
		//Splitting   //This simple for loop not for each loop
		for(String x :Fullname.split(" ")) System.out.println(x);
		
		
		
		
		

	}

}
