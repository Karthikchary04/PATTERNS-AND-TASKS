package stringPrograms;
import java.util.Scanner;
public class FirstCharCapitalInString
{
    public void capitalize(String str)
    {
    	char ch[]=str.toCharArray();
    	for(int i=0;i<ch.length;i++)
    	{
    		if(ch[i]==' ')
    		{
    			if(ch[i+1]>='a' && ch[i+1]<'z')
    			{
    				int asvalue=(int)ch[i+1];
    				asvalue-=32;
    				ch[i+1]=(char)asvalue;
    			}
    		}
    		else if(i==0)
    		{
    			if(ch[i]>='a' && ch[i]<'z')
    			{
    				int asvalue=(int)ch[i];
    				asvalue-=32;
    				ch[i]=(char)asvalue;
    			}
    		}
    	}
    	for(int i=0;i<ch.length;i++)
    	{
    		System.out.print(ch[i]);
    	}
    }
	public static void main(String[] args) 
	{
		FirstCharCapitalInString fc= new FirstCharCapitalInString();
		Scanner s=new Scanner(System.in);
		System.out.println("enter String");
		String str=s.nextLine();
		fc.capitalize(str);
	}

}
