package patterns;
import java.util.Scanner;
public class Num_Pattern2
{
    public void pattern()
    {
    	System.out.println("enter n value");
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	for(int i=n;i>=1;i--)
    	{
    		for(int j=0;j<n;j++)
    		{
    		   System.out.print((i+j)%n+1+"   ");
    		}
    		System.out.println(" ");
        }
    }
	public static void main(String[] args)
	{
        Num_Pattern2 p=new Num_Pattern2();
        p.pattern();
	}

}
