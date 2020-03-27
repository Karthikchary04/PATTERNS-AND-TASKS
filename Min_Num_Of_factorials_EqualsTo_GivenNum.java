package interview_tasks;

import java.util.Scanner;

public class Min_Num_Of_factorials_EqualsTo_GivenNum 
{
    public void findingMin(int num)
    {
    	int temp=num,result=0;
    	
    	int fact[]=new int[14];
    	fact[0]=1;
    	int size=1;
    	for(int i=1;fact[i-1]<=num;i++)
    	{
    		fact[i]=(fact[i-1]*i);
    		size++;
    	}
    	for(int i=size-1;i>=0;i--)
    	{
    		while(num>=fact[i])
    		{
    			num-=fact[i];
    			if(num==0)
    				result=fact[i];
    				break;
    		}
    		System.out.println(result);
    	}
    }
	public static void main(String[] args) 
	{
        Min_Num_Of_factorials_EqualsTo_GivenNum m=new Min_Num_Of_factorials_EqualsTo_GivenNum();
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int num=s.nextInt();
        m.findingMin(num);
	}

}
