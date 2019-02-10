package com.oracle.helloworld;

public class Calculator {
	
	//this is calculator test
	  public static  int add(int ...a) 
	    { 
	       
	       int sum=0;
	        // using for each loop to display contents of a 
	        for (int i: a) {
	            sum=sum+i;
	        }
	       return sum;
	    } 
	  
	  public static int mul(int ...a) 
	    { 
	       
	       int mul=1;
	        // using for each loop to display contents of a 
	        for (int i: a) {
	            mul=mul*i;
	        }
	       return mul;
	    } 
	  

	

}
