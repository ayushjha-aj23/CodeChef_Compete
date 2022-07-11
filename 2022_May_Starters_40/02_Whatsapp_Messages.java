// Whatsapp Messages --- Problem Code: WHATSAPP

/* package codechef; // don't place package name! */

/*Chef recently installed Whatsapp on his mobile device. Currently, he has no unread messages.

Every hour, he receives X messages and he is able to read Y messages out of them. 
After some time Chef notices that he has several unread messages.

Can you tell him exactly how many unread messages Chef has after Z hours have passed?

Input Format
The first line of input will contain a single integer T, denoting the number of test cases. The description of the test cases follows.
Each test case consists of a single line containing three space-separated integers X,Y, and Z$, 
denoting the number of messages Chef receives every hour, the number of messages he reads every hour, the and number of hours that have passed, respectively.

Output Format
For each test case, output on a new line a single integer denoting the number of unread messages after Z hours.*/

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
		    int X = sc.nextInt();  // No. of Message Recieved
		    int Y = sc.nextInt();  // No. of Message Read
		    int Z = sc.nextInt();  // No. of Hours 
		
		    System.out.println((X*Z)-(Y*Z));
		    T--;
		}
		
	}
}
