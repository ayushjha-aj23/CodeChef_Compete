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
		    int N = sc.nextInt(); // no. of expenses
		    int X = sc.nextInt(); // value of x for 2^X as total income 
		    int totalIncome = (int) Math.pow(2, X);
		    int saving = 0;
		    
		    //System.out.println(N + " " + X + " " + totalIncome);
		    
		    int totalExpenses = (int) Math.pow(2, N);
		    saving = totalIncome/totalExpenses;
		    System.out.println(saving);
		    
		    T--;
		}
	}
	
	
}
