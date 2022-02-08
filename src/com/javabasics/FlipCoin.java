package com.javabasics;

import java.util.Scanner;

public class FlipCoin 
{ 
	public static void main(String[] args)
	{
        int heads = 0;
        int tails = 0;
        int counter = 1;
        double perh = 0;
        double pert = 0;
        int t = 100;
        double randNum = 0.0;
        Scanner in = new Scanner(System.in);
         
        System.out.println("How many times will the coin be flipped? ");
        int flips = in.nextInt();
         
        while(counter <= flips)
        {
            randNum = Math.random();
            System.out.print(counter + "\t" + randNum);
             
            if(randNum > 0.5)
            {
                heads++;
                System.out.println("\t heads");
            }
            else
            {
                tails++;
                System.out.println("\t tails");
                in.close(); 
               }
            counter++;      
        }
        System.out.println();
        System.out.println("Number of Heads = " + heads);
        System.out.println("Number of Tails = " + tails);
        //percentage calculations head and tails
        perh = (heads * +t) / flips; 
        pert = (tails * +t) / flips;
       
       System.out.println("Percentage of Heads : "+perh);
       System.out.println("Percentage of Tails : "+pert);
        
    }
}
