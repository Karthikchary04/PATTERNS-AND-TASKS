package patterns;

import java.util.Scanner;

public class Star_Pattern2 
{
    public void pattern()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	int n=s.nextInt();
    	n*=3;
    	for(int i=-n;i<=n;i++)
    	{
    		  for(int j=-n;j<=n;j++)
    		  {
    			  if((Math.abs(j)%3==0 && Math.abs(i)<=Math.abs(j)) || (Math.abs(j)<=Math.abs(i) && Math.abs(i)%3==0))
    			      System.out.print("* ");
    			  else
    				  System.out.print("  ");
    		  }
    		 System.out.println(" ");
    	}
    }
	public static void main(String[] args) 
	{
       Star_Pattern2 sp=new Star_Pattern2();
       sp.pattern();
	}
}
