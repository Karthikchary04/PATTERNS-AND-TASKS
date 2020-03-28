package patterns;

public class Star_Pattern3 
{
    public void pattern()
    {
       for(int i=1;i<=5;i++)
       {
    	   for(int j=1;j<=5;j++)
    	   {
    		   if(((i==1 || i==5) && j%3==0) ||((i==2 ||i==4) && (j%2==0 || j%3==0)) || (i==3))
    		   {
    			   System.out.print("*");
    		   }
    		   else 
    		   {
    			   System.out.print(" ");
    		   }
    	   }
    	   System.out.println();
       }
    }
	public static void main(String[] args)
	{
        Star_Pattern3 s=new Star_Pattern3();
        s.pattern();
	}
}
