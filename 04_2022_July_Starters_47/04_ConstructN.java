//Construct N Problem Code: CONN

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
		    int N = sc.nextInt();
		    
		    // 2*X+7*Y = N
		    // if Y = 0 then 2*(1) = 2, 2*(2) = 4, 2*(3) = 6, 8, 10, ..... i.e. all even numbers are possible
		    
		    // if Y = 1 then 2*(0) + 7*(1) = 7, 2*(1) + 7*(1) = 9, 2*(2) + 7*(1) = 11, 13, 15, ..... i.e. all odd numbers starting from 7
		    
		    // So the only numbers that are not divided into multiple of 2 and 7 is 1, 3, 5
		    
		    if( (N==1) || (N==3) || (N==5) )
		        System.out.println("No");
		    else
		        System.out.println("Yes");
		}
	}
}
