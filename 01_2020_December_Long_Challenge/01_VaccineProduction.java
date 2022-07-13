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
		
		Scanner sc= new Scanner(System.in);
		int D1=sc.nextInt();
		int V1=sc.nextInt();
		int D2=sc.nextInt();
		int V2=sc.nextInt();
		int P=sc.nextInt();
		
		int count_days=0;
		int total_vaccines_produced=0;
		
		
    		   /* if(D1==1&&D2==1)
    		    {
    		        while(total_vaccines_produced<P)
    		        {
    		            total_vaccines_produced=total_vaccines_produced+(V1+V2);
    		            count_days++;
    		        }
    		        System.out.println(count_days);
    		    }
    		    else
    		    {
        		  if(D1!=D2)
        		  {
        		      if(D1<D2)
        		      {
        		          count_days=count_days+(D1-1);
        		          while(total_vaccines_produced<P)
        		          {
        		              while((D1!=D2) && (total_vaccines_produced<P))
        		              {
        		                  total_vaccines_produced=total_vaccines_produced+V1;
        		                  count_days++;
        		                  D1++;
        		                  if(total_vaccines_produced>=P)
        		                  {
        		                      System.out.println(count_days);
        		                  }
        		              }
        		              
        		              while(total_vaccines_produced<P)
        		              {
        		                  total_vaccines_produced=total_vaccines_produced+(V1+V2);
        		                  count_days++;
        		              }
        		              System.out.println(count_days);
        		          }
        		          
        		      }
        		      else
        		      if(D1>D2)
        		      {
        		          count_days=(D2-1);
        		          while(total_vaccines_produced<P)
        		          {
        		              while((D2!=D1) && (total_vaccines_produced<P))
        		              {
        		                  total_vaccines_produced=total_vaccines_produced+V2;
        		                  count_days++;
        		                  D2++;
        		                  if(total_vaccines_produced>=P)
        		                  {
        		                      System.out.println(count_days);
        		                  }
        		              }
        		              
        		              while(total_vaccines_produced<P)
        		              {
        		                  total_vaccines_produced=total_vaccines_produced+(V1+V2);
        		                  count_days++;
        		              }
        		              System.out.println(count_days);
        		          }
        		      }
        		  }
        		  else
        		  if(D1==D2)
        		  {
        		      count_days=(D1-1);
        		      while(total_vaccines_produced<P)
        		      {
        		          total_vaccines_produced=total_vaccines_produced+(V1+V2);
        		          count_days++;
        		      }
        		      System.out.println(count_days);
        		  }
    		    }*/
    		    
    		    
    		    if(D1!=D2)
				{
        		    if(D1<D2)
            		  { count_days =(D1-1);
            		    while((D1!=D2) && (total_vaccines_produced<P))
            		    {   
            		      total_vaccines_produced=total_vaccines_produced+V1;
            		      count_days++;
            		      D1++;
            		      if(total_vaccines_produced>=P)
            		      {
            		        System.out.println(count_days);
    						break;
            		      }
            		   } 
            		  }
				
        		    else if(D1>D2)
            		  {   count_days=(D2-1);
    					  while((D2!=D1) && (total_vaccines_produced<P))
            		      {
            		          total_vaccines_produced=total_vaccines_produced+V2;
            		          count_days++;
            		          D2++;
            		          if(total_vaccines_produced>=P)
            		          {
            		            System.out.println(count_days);
    							break;
            		          }
            		       }
            		  }
				}
        		  if(D1==D2 && total_vaccines_produced<P)
					{
        		      count_days=(D1-1);
        		      while(total_vaccines_produced<P)
        		      {
        		          total_vaccines_produced=total_vaccines_produced+(V1+V2);
        		          count_days++;
        		      }
        		      System.out.println(count_days);
					}
	}
}
	



