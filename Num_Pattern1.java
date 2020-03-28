package patterns;

import java.util.Scanner;

public class Num_Pattern1
{
    public void pattern(int n)
    {
    	for(int i=-n;i<=n;i++)
    	{
    		for(int j=-n;j<=n;j++)
    		{
    			if(Math.abs(j)<=n-Math.abs(i))
    				System.out.print(Math.abs(j)+" ");
    			else
    				System.out.print("  ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args) 
	{
        Num_Pattern1 np=new Num_Pattern1();
        Scanner s=new Scanner(System.in);
        System.out.println("enter n value");
        int n=s.nextInt();
        np.pattern(n);
	}

}
