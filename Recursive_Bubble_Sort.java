package interview_tasks;

import java.util.Scanner;

public class Recursive_Bubble_Sort
{
    public void bubbleSort(int arr[],int n)
    {
    	int temp=0;
    	if(n==1)
    		return;
    	for(int i=0;i<n-1;i++)
    	{
    		if(arr[i]>arr[i+1])
    		{
    			temp=arr[i];
    			arr[i]=arr[i+1];
    			arr[i+1]=temp;
    		}
    	}
    	bubbleSort(arr,n-1);
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
        Recursive_Bubble_Sort r=new Recursive_Bubble_Sort();
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        int arr[]=new int[n];
        System.out.println("enter "+n+ "value");
        for(int i=0;i<n;i++)
        {
        	arr[i]=s.nextInt();
        }
        r.bubbleSort(arr,n);
        r.display(arr,n);
	}
}
