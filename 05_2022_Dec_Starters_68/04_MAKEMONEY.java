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
		
		int T = sc.nextInt();
		
		while(T>0)
		{
		    int N = sc.nextInt();
		    int X = sc.nextInt();
		    int C = sc.nextInt();
		    
		    int[] Nbags = new int[N];
		    int SUM = 0;
		    int COUNTER = 0;
		    
		    for(int i=0;i<N;i++)
		    {
		        Nbags[i] = sc.nextInt();
		    }
		    
		    //int SUM = 0;
		    //int COUNTER = 0;
		    
		    for(int i=0;i<N;i++)
		    {
		        if(X-Nbags[i] > C)
		        {
		            SUM = SUM + X;
		            COUNTER = COUNTER + C;
		        }
		        else 
		            SUM = SUM + Nbags[i];
		    }
		    
		    System.out.println(SUM-COUNTER);
		    
		    T--;
		}
	}
}
