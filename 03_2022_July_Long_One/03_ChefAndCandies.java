// Chef and Candies Problem Code: CHEFCAND

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
		
		while(test_cases>0)
		{
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    
		    int candies_to_buy = N-X;
		    
		    if(candies_to_buy<0)
		        System.out.println("0");
		    else 
		    {
		        if(candies_to_buy%4==0)
		        {
		            int packets = candies_to_buy/4;
		            System.out.println(packets);
		        }
		        else if(candies_to_buy%4!=0)
		        {
		            int packets = (candies_to_buy/4)+1;
		            System.out.println(packets);
		        }
		        
		    }
		    
		    test_cases--;
		}
	}
}
