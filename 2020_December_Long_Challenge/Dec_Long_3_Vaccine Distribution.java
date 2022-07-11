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
		int T=0; //T represents the test cases 
		Scanner sc = new Scanner(System.in);
		T=sc.nextInt();
		
		int[] results = new int [T]; 
		int C =T;
		while(T!=0)
		{   int high_risk=0;
		    int low_risk=0;
		    
		    int N=sc.nextInt(); // Number of People to be Vaccinated
		    int D=sc.nextInt(); // Vaccines per day
		    
		    
		    int[] Ages= new int[N];
		    for(int i=0;i<N;i++)
		    {
		        Ages[i]=sc.nextInt();
		    }
		    //.....
		    

		    
		    for(int i=0;i<N;i++)
		    {  if(Ages[i]>=80 || Ages[i]<=9)
		        high_risk++;
		       else
		        low_risk++;
		    }   
    		    int low_risk_days=0;
    		    int high_risk_days=0;
    		    
    		    if(high_risk%D!=0)
    		        high_risk_days=(high_risk/D)+1;
    		    else
    		        high_risk_days=(high_risk/D);
    		        
    		   if(low_risk%D!=0)
    		        low_risk_days=(low_risk/D)+1;
    		    else
    		        low_risk_days=(low_risk/D);
		    
    		  results[C-T]=high_risk_days+low_risk_days;
    		        
		    T--;
		}
		for(int i=0;i<C;i++)
		{
		    System.out.println(results[i]);
		}
	}
}
