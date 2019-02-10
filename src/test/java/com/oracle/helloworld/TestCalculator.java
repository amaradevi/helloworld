package com.oracle.helloworld;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestCalculator {
//this is calculator test
	
	 @Test
	   public void testAddition() {
		 
		 assertEquals(9, Calculator.add(2,3,4));
		 
	
	  }
	 
	 @Test
	   public void testAddition1() {
		 
		 assertEquals(5,Calculator.add(2,3));
	  }
	 
	 
	 @Test
	   public void testMul1() {
		 
		 assertEquals(24,Calculator.mul(2,3,4));
		 
	 }
	 
	 @Test
	   public void testMul2() {
		 
		 assertEquals(60,Calculator.mul(2,3,10));
		 
	  }
}
