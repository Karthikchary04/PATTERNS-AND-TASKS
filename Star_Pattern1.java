package patterns;

public class Star_Pattern1
{
    public void pattern()
    {
    	for(int i=1;i<=7;i++)
    	{
    		for(int j=1;j<=i;j++)
    		{
    			System.out.print("*  ");
    		}
    		System.out.println();
    	}
    }
	public static void main(String[] args)
	{
       Star_Pattern1 p=new Star_Pattern1();
       p.pattern();
	}
}
