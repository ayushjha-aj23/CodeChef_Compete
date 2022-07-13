/* package codechef; // don't place package name! */

/*
Input Format

The first line of input will contain a single integer T, denoting the number of test cases. 
The description of the test cases follows.
Each test case consists of 2 lines of input.
The first line contains a single integer N, the number of problems solved by the students
The second line contains N space-separate integers, the difficulty ratings of the problems 
attempted by the students in order.

Output Format

For each test case, output in a new line “Yes” if the problems are attempted in non-decreasing order 
of difficulty rating and “No” if not. The output should be printed without the quotes.
Each letter of the output may be printed in either lowercase or uppercase. 
For example, the strings yes, YeS, and YES will all be treated as equivalent.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static boolean isSorted(int a[], int N)
	{
	     if(a == null || N <= 1)
		    return true;
		            
		    for(int i=0;i<N-1;i++)
		    {
		        if(a[i]>a[i+1])
		            return false;
		    }
		    
		    return true;
	}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0)
		{
		    int N = sc.nextInt();
		    int a[] = new int[N];
		    boolean b;
		    
		    for(int i=0;i<N;i++)
		    {
		        a[i] = sc.nextInt();
		    }
		    
		    b = isSorted(a, N);
		    
		    if(b == false)
		        System.out.println("No");
		    else 
		        System.out.println("Yes");
		    
		    T--;
		}
	}
}
