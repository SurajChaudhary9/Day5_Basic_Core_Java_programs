package com.javabasics;

import java.util.Scanner;

public class QuotientRemainder {

	  public static void main(String[] args)
	  {
	  Scanner in = new Scanner(System.in);
	    
	   System.out.println("Enter Dividend : ");
	    int dividend = in.nextInt();
	    
	   System.out.println("Enter Divisor : ");
	    int divisor = in.nextInt();
	    
	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;
	    
	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	    in.close();
	    
	  	}
	}