// Chess Time Problem Code: CHESSTIME

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
		    int Hour = sc.nextInt();
		    
		    int max_game = (Hour*60)/20;
		    
		    System.out.println(max_game);
		}
	}
}
