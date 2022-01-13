package javabasics;

import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

	private static final String LinkedList = null;

	public static void main(String[] args) {
		///####creating & Initializing ARRAY of 3 elements//
		int[] numbers=new int[3];
		numbers[0]= 10;
		numbers[1]=20;
		numbers[2]=30;
		System.out.println(numbers);
		
		//shortcut
		int[] numbers1 = {10,20,30};
		System.out.println(numbers1);
		
		
		      //############# The Array Class #############  //
		int[] numbers2 = {3,6,9,23,13,56};      //single dimension array 
		
		Arrays.sort(numbers2);
		String result =Arrays.toString(numbers2);
		System.out.println(result);
		
		
		//*********************Multi Dimension Arrays********************//
		
		int a3[][]=new int [2][2];
		
		//Create & Initialize 
		// a4 [How many down] [How many Across]      //i.e.a4[rows][cloumns]
		
		String [][] a4= {{"00" ,"10"} , {"01","11"}};
		
		System.out.println(a4[1][1]); //1ts row & 1st column no.will be printed i.e. 11 here
		
		
		//******************Arraylist**********************//
		ArrayList<String> al1=new ArrayList<String>(20);
		
		//add value
		al1.add("Vaibhav");
		
		//Generate an Arraylist//
		ArrayList<Integer> aL2=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		for(Integer x:aL2) 
		{
			System.out.println(x);   //for loop 
		}
		
		//get a value
		System.out.println(aL2.get(1));
		System.out.println("------------------------");
		
		//add a value at index
		aL2.set(1, 5);
       for(Integer x:aL2)  System.out.println(x);
         System.out.println("---------------");
		
		///Delete value (Delete all aL2.clear())
         aL2.remove(3);
         for(Integer x :aL2)  
         {
        	 System.out.println(x);
         }
        	 
         
         //##################LinkedList  #####################
         //best when u have to make changes in the middle of  the list
         //each link has a reference to the value before & the value after
         
        java.util.LinkedList<Integer> lL1  =new java.util.LinkedList<Integer>();
        
        //Add value
        lL1.add(1); lL1.add(2); lL1.add(3);
        
        //Add Array to list
        lL1.addAll(Arrays.asList(1,2,3,4));
        
        //Add to front (add Last Also)
        lL1.addFirst(0);
        
        //Check if in list
        System.out.println(lL1.contains(4));
        
        //get index for match 
        System.out.println(lL1.indexOf(4));
        
        //Replace 
        lL1.set(0,2);
        
        //Get Value 
        //Also getFirst,getLast
        System.out.println(lL1.get(0));
        
        //Delete (clear() removes all)
        lL1.remove(1);
        
        //get size
        System.out.println(lL1.size());
        
        //Convert to Array
        Object[] a9=lL1.toArray(); 
        
		
		
		
		
		
				

	}

}
