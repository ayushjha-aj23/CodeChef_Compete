// Slow Solution Problem Code: SLOWSOLN

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
		
		while (test_cases>0)
		{
		    int maxT = sc.nextInt();
		    int maxN = sc.nextInt();
		    int sumN = sc.nextInt();
		    
		    int current_N = maxN;
		    int current_T = 1;
		    int result = 0;
		    
		    while(current_N<sumN && current_T<maxT)
		    {
		        current_N = current_N+ maxN;
		        current_T++;
		    }
		    
		    //System.out.println(current_N+" "+ current_T);
		    
		    if(maxN*current_T<=sumN)
		    {
		        result = current_T*(maxN*maxN);
		    }
		    else // If sumN is not multiple of maxN
		    {
		        // All test cases with max N to be taken
		        result = (current_T-1)*(maxN*maxN);
		        
		        // To find out the value of N which are not having value of N as maxN
		        int left_N = sumN-(maxN*(current_T-1));
		        //System.out.println("left N" + left_N);
		        
		        result = result + (left_N*left_N);
		    }
		    
		    System.out.println(result);
		    
		    
		    test_cases--;
		}
	}
}
