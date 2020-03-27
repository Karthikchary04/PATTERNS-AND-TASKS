package interview_tasks;

import java.util.Scanner;

public class Finding_All_Pairs_Of_Array 
{
    public void allPairs(int arr[],int n)
    {
    	for(int i=0;i<n;i++)
    	{
    		for(int j=0;j<n;j++)
    		{
    			System.out.print("("+arr[i]+" "+arr[j]+")");
    		}
    	}
    }
	public static void main(String[] args) 
	{
        Finding_All_Pairs_Of_Array f=new Finding_All_Pairs_Of_Array();
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter"+n+"values");
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        f.allPairs(arr, n);
	}
}
