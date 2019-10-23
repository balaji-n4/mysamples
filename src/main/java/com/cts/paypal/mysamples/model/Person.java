package com.cts.paypal.mysamples.model;

public class Person {

	 private String s; 
	  
	    // creating a public constructor 
	    public Person()  {  s = "GeeksforGeeks"; } 
	  
	    // Creating a public method with no arguments 
	    public void method1()  { 
	        System.out.println("The string is " + s); 
	    } 
	  
	    // Creating a public method with int as argument 
	    public void method2(int n)  { 
	        System.out.println("The number is " + n); 
	    } 
	  
	    // creating a private method 
	    private void method3() { 
	        System.out.println("Private method invoked"); 
	    } 

}
