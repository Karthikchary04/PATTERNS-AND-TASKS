package interview_tasks;
import java.util.Scanner;
public class Perfect_Cube_String {
    public void perfectCube(String str)
    {
    	int sum=0;
    	char ch[]=str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		sum+=(int)ch[i];
    	}
    	long cr=(long)(Math.cbrt(sum));
    	System.out.println("cr"+cr);
    	if(cr*cr*cr==sum)
    		System.out.println("string is perfect cube");
    	else
    		System.out.println("string is not a perfect cube");
    }
	public static void main(String[] args) 
	{
       Perfect_Cube_String p=new Perfect_Cube_String();
       Scanner s=new Scanner(System.in);
       System.out.println("enter string");
       String str=s.nextLine();
       p.perfectCube(str);
	}

}
