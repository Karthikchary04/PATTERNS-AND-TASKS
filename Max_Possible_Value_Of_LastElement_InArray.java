package interview_tasks;

import java.util.Scanner;

public class Max_Possible_Value_Of_LastElement_InArray 
{
    public void maxValue(int arr[],int n,int moves)
    {
    		for(int i=n-2;i>=0;i--)
    		{
    		   if(arr[i]>0)
    		   {
    			   int distance=n-1-i;
    			   if(moves<distance)
    			   {
    				   break;
    			   }
    			   int canTake=moves/distance;
    			   int take=Math.min(arr[i],canTake);
    			   arr[n-1]+=take;
    			   moves-=take*distance;
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
         Max_Possible_Value_Of_LastElement_InArray m=new Max_Possible_Value_Of_LastElement_InArray();
         Scanner s=new Scanner(System.in);
         System.out.println("enter n value");
         int n=s.nextInt();
         int arr[]=new int[n];
         System.out.println("enter "+n+" values");
         for(int i=0;i<n;i++)
         {
        	 arr[i]=s.nextInt();
         }
         System.out.println("enter moves");
         int moves=s.nextInt();
         m.maxValue(arr, n, moves);
         m.display(arr, n);
	}

}
