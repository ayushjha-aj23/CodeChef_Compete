// Bidding Problem Code: AUCTION

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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    
		    if(A>B && A>C)
		        System.out.println("Alice");
		    else if(B>A && B>C)
		        System.out.println("Bob");
		    else if(C>A && C>B)
		        System.out.println("Charlie");
		    test_cases--;
		}
	}
}
