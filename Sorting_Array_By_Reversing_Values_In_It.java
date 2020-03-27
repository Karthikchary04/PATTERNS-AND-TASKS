package interview_tasks;

import java.util.Scanner;

public class Sorting_Array_By_Reversing_Values_In_It {
    public void reversingElementsInArray(int arr[],int n)
    {
    	int rem=0,rev=0;
    	for(int i=0;i<n;i++)
    	{
    		while(arr[i]!=0)
    		{
    			rem=arr[i]%10;
    			rev=rev*10+rem;
    			arr[i]=arr[i]/10;
    		}
    		arr[i]=rev;
    		rem=0;rev=0;
    	}
    }
    public void sorting(int arr[],int n)
    {
    	int temp=0;
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
    }
    public void display(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		System.out.println(arr[i]);
    	}
    }
	public static void main(String[] args) 
	{
          Sorting_Array_By_Reversing_Values_In_It a=new Sorting_Array_By_Reversing_Values_In_It();
          Scanner s=new Scanner(System.in);
          System.out.println("enter n value");
          int n=s.nextInt();
          int arr[]=new int[n];
          System.out.println("enter "+n+"values");
          for(int i=0;i<n;i++)
          {
        	  arr[i]=s.nextInt();
          }
          a.reversingElementsInArray(arr,n);
          a.sorting(arr, n);
          a.display(arr, n);
	}
}
