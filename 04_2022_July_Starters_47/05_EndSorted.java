// End Sorted Problem Code: ENDSORTED

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
		
		while(test_cases-- >0)
		{
		    ArrayList<Integer> a = new ArrayList<>();
		    int n = sc.nextInt();
		    
		    int max = Integer.MIN_VALUE;
		    int max_index = -1;
		    int count = 0;
		    
		    for(int i=0;i<n;i++)
		    {
		       int num = sc.nextInt();
		       a.add(num);
		    }
		    
		    for(int i=0;i<n;i++)
		    {
		        if(a.get(i)>max)
		        {
		            max = a.get(i);
		            max_index = i;
		        }
		    }
		    
		    count += n-max_index-1;
		    
		    a.remove(max_index);
		    
		    a.add(max);
		    
		    int min = Integer.MAX_VALUE;
		    int min_index = 0;
		    
		    for(int i=0;i<n;i++)
		    {
		        if(a.get(i)<min)
		        {
		            min = a.get(i);
		            min_index = i;
		        }
		    }
		    //a.add(0,min);
		    count += min_index;
		    
		    System.out.println(count);
		    
		    
		}
	}
}
