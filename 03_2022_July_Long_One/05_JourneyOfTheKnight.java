// Journey of the Knight Problem Code: KNIGHT2

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
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    
		    if((x1+y1)==0)
		    {
		        if((x2+y2)==0)
		            System.out.println("Yes");
		        else
		            System.out.println("No");
		    }
		    else
		    {
		        
		    }
		    
		}
		
		
	}
}
