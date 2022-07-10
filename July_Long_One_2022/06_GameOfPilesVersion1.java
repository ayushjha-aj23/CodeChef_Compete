// Game of Piles Version 1 Problem Code: GAMEOFPILES1

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int test_cases = sc.nextInt();
		
		while(test_cases-- > 0)
		{
		    int no_of_piles = sc.nextInt();
		    
		    // An array of N piles
		    int[] no_of_stones_each_pile = new int[no_of_piles];
		    
		    // To store the no of stones in each pile
		    for(int i=0;i<no_of_piles;i++)
		    {
		        // Input no of stones 
		        no_of_stones_each_pile[i] = sc.nextInt();
		    }
		    
		    
		    int sum = 0;
		    int count = 0;
		    
		    for(int j=0;j<no_of_piles;j++)
		    {
		        sum = sum + no_of_stones_each_pile[j];
		        
		        if(no_of_stones_each_pile[j] == 1)
		            count++;
		    }
		    
		    if(count>0)
		        System.out.println("Chef");
		    else
		    {
		        if(sum%2==0)
		            System.out.println("Chefina");
		        else if(sum%2!=0)
		            System.out.println("Chef");
		    }
		    
		    
		}
	}
}
