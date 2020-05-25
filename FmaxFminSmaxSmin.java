package interview_tasks;

import java.util.Scanner;

public class FmaxFminSmaxSmin 
{
    public void maxMin(int arr[],int n)
    {
    	int temp=0,max=0;
    	for(int i=0;i<n-1;i++)
    	{
    		for(int j=0;j<n-1;j++)
    		{
    			if(arr[j]>arr[j+1])
    			{
    				temp=arr[j];
    				arr[j]=arr[j+1];
    				arr[j+1]=temp;
    			}
    		}
    	}
        int arr1[]=new int[n];
    	int first=0,last=n-1;
    	boolean b=true;
    	for(int i=0;i<n;i++)
    	{
    		if(b)
    		{
    			arr1[i]=arr[last--];
    		}
    		else
    		{
    			arr1[i]=arr[first++];
    		}
    		b=!b;
    	}
    	for(int i=0;i<n;i++)
    	{
    		System.out.print(arr1[i]+" ");
    	}
   	}
	public static void main(String[] args)
	{
       FmaxFminSmaxSmin f=new FmaxFminSmaxSmin();
       Scanner s=new Scanner(System.in);
       System.out.println("enter n value");
       int n=s.nextInt();
       int arr[]=new int[n];
       System.out.println("enter"+n+"values");
       for(int i=0;i<n;i++)
       {
    	   arr[i]=s.nextInt();
       }
       f.maxMin(arr,n);
	}
}
