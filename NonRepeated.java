package interview_tasks;

import java.util.Scanner;

public class NonRepeated
{

	public void nonrepeatedchar()
	{
		String str;
		int count=1;
		System.out.println("enter string");
		Scanner s =new Scanner(System.in);
		str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;	
				}
			}
			if(count==1)
			{
				System.out.println(ch[i]);
				break;
			}
			count=1;
		}
	}
	public static void main(String[] args) 
	{
	NonRepeated u=new NonRepeated();
	u.nonrepeatedchar();
	}

}
