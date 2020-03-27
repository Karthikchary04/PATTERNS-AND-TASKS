package interview_tasks;

import java.util.Scanner;

public class DuplicateElements 
{
	public void duplicate()
	{
		String str;
		int count=1;
		System.out.println("enter string");
		Scanner s =new Scanner(System.in);
		str=s.nextLine();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=' ')
			{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]=' ';
				}
			}
			if(count>1)
			{
				System.out.println(ch[i]);
			}
			}
			count=1;
		}
		
	}
	public static void main(String[] args)
	{
        DuplicateElements d=new DuplicateElements();
       d.duplicate();
      
	}

}
