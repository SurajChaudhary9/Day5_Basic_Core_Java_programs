package com.javabasics;

import java.util.Scanner;

public class LargestThreeNumbers
{

    public static void main(String[] args) {

    	int n1,n2,n3;
	      
    	System.out.println("Enter Three Numbers :: ");
	      Scanner sc = new Scanner(System.in);
	      n1 = sc.nextInt();
	      n2 = sc.nextInt();
	      n3 = sc.nextInt();

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
        sc.close();
    }
}