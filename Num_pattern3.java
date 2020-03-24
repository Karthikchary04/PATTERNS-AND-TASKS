package patterns;
import java.util.Scanner;
public class Num_pattern3 
{
    public void pattern()
    {
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter n value");
    	int n=s.nextInt();
    	for(int j=-n+1;j<n;j++)
    	{
    	  for(int i=-n+1;i<n;i++)
    	  {
    		if(Math.abs(i)<=Math.abs(j))
    		System.out.print(n-Math.abs(i)+"    ");
    		else
    			System.out.print(n-Math.abs(j)+"    ");
    	  }
    	  System.out.println();
    	}
    }
	public static void main(String[] args)
	{
       Num_pattern3 p=new Num_pattern3();
       p.pattern();
	}
}