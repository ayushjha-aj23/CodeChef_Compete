// Pass the Exam Problem Code: PASSTHEEXAM

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
		    
		    int total_marks = A+B+C;
		    
		    if(total_marks>=100 && ( (A>=10) && (B>=10) && (C>=10) ) )
		        System.out.println("Pass");
		    else 
		        System.out.println("Fail");
		        
		    test_cases--;
		}
	}
}
