/*
	Program: WAP to print 5 functions of String
	@author: Saina Khan
	@Date: 17 Nov 2022  
	*/	
package com.TestProgram2;

public class StringFunction {
	//First Function of String
	public static void main(String args[]){
		{
		String s1="Hello";
		String s2="World";
		System.out.println("string length is: "+s1.length());
		System.out.println("string length is: "+s2.length());
		}
System.out.println("--------2nd Function----------------");
    //Second Function of String
     {  
       String s="Sachin";    
       System.out.println(s.toUpperCase());//SACHIN    
       System.out.println(s.toLowerCase());//sachin    
       System.out.println(s);//Sachin(no change in original)    
}
     System.out.println("--------3rd Function----------------");

     //Third Function of String
     {
     String s1="Java is a programming language. Java is a platform. Java is an Object Oriented Programming Language";      
     String replaceString=s1.replace("Java","Kava");//replaces all occurrences of "Java" to "Kava"      
     System.out.println(replaceString);   
     }
     System.out.println("--------4th Function----------------");

     //fourth Function of String
     {
     String s1="love is immortal";
     String s2="and coding is divine ";
     String joined_string = s1.concat(s2);
     System.out.println(joined_string); // prints love is immortal and coding is divine
     }
     System.out.println("--------5th Function----------------");

	 //Fifth Function of string
     {
    	 int number=100;  // similarly we can convert another data types too

    	 String str=String.valueOf(number);

    	 System.out.println(str+10);
     }
     //End of Method
   }
	//End of the Class
}
//End of the Program

