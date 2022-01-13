package javabasics;

public class DataTypes {

	public static void main(String[] args) {

		///    Primitive Type     ////
		
		int age = 30;
		System.out.println("the age is "+age);
		
		age =45;
		System.out.println("the age is "+age);
		
		int hisAge= age;
		System.out.println("his age is "+hisAge );

		byte herAge=30;
		System.out.println("herAge is "+herAge);
		
		long viewCount=4_123_567L;
		System.out.println("the viewCount is "+viewCount);
		
		float price= 10.99f;
		System.out.println("The float no is "+price);
		
		char letter='A';
		System.out.println("CHAR Variable is "+letter);
		
		boolean isEligible =true;
		System.out.println("The Boolean value is "+isEligible);
		
		
		System.out.println("ByteMax" +Byte.MAX_VALUE);
		
		System.out.println("Bytemin"+Byte.MIN_VALUE);
		
		System.out.println("Charmax "+( Character.MAX_VALUE+0));
		
		
		

//		        System.out.println("Byte Min"+Byte.MIN_VALUE);
//
//		        System.out.println("Short Max: " +Short.MAX_VALUE);
//
//		        System.out.println("Short Min: " +Short.MIN_VALUE);
//
//		                
//
//		        System.out.println("Char Max: " +
//
//		                (Character.MAX_VALUE+0));
//
//		        System.out.println("Char Min: " +
//
//		                (Character.MIN_VALUE+0));
//
//		        System.out.println("Int Max: " +
//
//		                Integer.MAX_VALUE);
//
//		        System.out.println("Int Min: " +
//
//		                Integer.MIN_VALUE);
//
//		        System.out.println("Float Max: " +
//
//		                Float.MAX_VALUE);
//
//		        System.out.println("Float Min: " +
//
//		                Float.MIN_VALUE);
//
//		        System.out.println("Double Max: " +
//
//		                Double.MAX_VALUE);
//
//		        System.out.println("Double Min: " +
//
//		                Double.MIN_VALUE);
//
//		        System.out.println("Long Max: " +
//
//		                Long.MAX_VALUE);
//
//		        System.out.println("Long Min: " +
//
//		                Long.MIN_VALUE);


		
		//FLOATING POINT PRECISION 6 decimals //
		float fNum =1.111111111111111F;
		float fNum2 =1.111111111111111111F;
		
		System.out.println("Float :"+(fNum +fNum2));
		
		//Double prescion 15 decimals
		
		double dblNum=1.11111111111111111111111;
		double dblNum2=1.11111111111111111111;
		System.out.println("Double :" + (dblNum + dblNum2));
		
		//can use scientific notations 
		double thousand =1e+3;
		System.out.println(thousand);
		
		//you can define long with _
		long bigNum=123_456_789;
		
		
		///casting //
		//implicit casting happens bcause we try to store a short
		//value (2 byte ) into an int (4 bytes)
		
		short x=1;
		int y= x;
		System.out.println(y);
		
		//Explicit casting 
		
		int ax=5;
		short b= (short) ax;
		System.out.println(b);
		
		//Use (newType) otherwise	
		
		double cDbl=1.234;
		int cInt =(int) cDbl;
		System.out.println(cInt);
		
		long bigLong =2147483574L;
		int bInt =(int) bigLong ;
		System.out.println(bInt);

		//use wrapper class to convert to string 
		String favNum=Double.toString(1.618);
		System.out.println(favNum);
		
		//convert String to primitives with 
		//Byte.parseByte, Boolean.parseBoolean,
		//and the same format for each type
		//except for chars
		int strInt =Integer.parseInt("10");
		System.out.println(strInt);
		
	}

}

