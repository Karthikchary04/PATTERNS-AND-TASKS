package interview_tasks;

import java.util.Scanner;

public class FmaxFminSmaxSmin 
{
    public void maxMin(int arr[],int n)
    {
    	int max=0,loc=0,min=0;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]!=0)
    		{
    		  for(int j=0;j<n;j++)
    		  {
    			if(arr[j]!=0)
    			{
    		       if(max<arr[j])
    		       {
    			     max=arr[j];
                     loc=j;
    		       }
    			}
    		  }
    		  arr[loc]=0;
    		  System.out.println("max:"+max);
    		  max=0;
    		  loc=0;
    		}
    	}
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]!=0)
    		{
    			min=arr[i];
    		  for(int j=0;j<n;j++)
    		  {
    			if(arr[j]!=0)
    			{
    		       if(min>arr[j])
    		       {
    			     min=arr[j];
                     loc=j;
    		       }
    			}
    		  }
    		  arr[loc]=0;
    		  System.out.println("min:"+min);
    		  min=0;
    		  loc=0;
    		}
    	}
    }
	public static void main(String[] args)
	{
       FmaxFminSmaxSmin f=new FmaxFminSmaxSmin();
       Scanner s=new Scanner(System.in);
       System.out.println("enter n value");
       int n=s.nextInt();
       int arr[]=new int[10];
       System.out.println("enter"+n+"values");
       for(int i=0;i<n;i++)
       {
    	   arr[i]=s.nextInt();
       }
       f.maxMin(arr,n);
	}

}
