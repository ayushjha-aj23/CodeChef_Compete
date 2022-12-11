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
		
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
		    String a = sc.next();
            String b = sc.next();
            
            //System.out.println("a is " + a + "b is " + b);
        
            int zero, one;
        
            zero = one = 0;
        
            // Count number of zeros and ones in both the string
            for(int i=0; i<a.length();i++)
            {
                if(a.charAt(i) == '0')
                    zero++;
                else
                    one++;
                
                if(b.charAt(i) == '0')
                    zero++;
                else
                    one++;
            }
        
            int temp = Math.min(zero, one);
            
            // System.out.println("Number of Zero is: " + zero + " Number of One is: " + one + " Value of temp is: " + temp); 
            
            String ans = "";
            
            for(int i=0; i<a.length(); i++)
                {
                    //ans += '1';
                    if(i<temp)
                        ans += "1";
                    else
                        ans += "0";
                    
                }
            
            //for(int i=temp; i<a.length(); i++)
                //ans += '0';
                
            System.out.println(ans);
		}
	}
}
