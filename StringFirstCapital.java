package interview_tasks;
import java.util.Scanner;
public class StringFirstCapital
{
    public void firstLetter(String letter[])
    {
    	for(int i=0;i<letter.length;i++)
    	{
    		if(letter[i].charAt(0)>='a' && letter[i].charAt(0)<='z' ) {
    			char c[] = letter[i].toCharArray();
    			c[0] = (char)(c[0] -32);
    			letter[i]=String.valueOf(c);
    		}
    	}
    }
	public static void main(String[] args) 
	{
		StringFirstCapital sc=new StringFirstCapital();
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		String letter[]=str.split(" ");
		sc.firstLetter(letter);
		StringBuilder sb = new StringBuilder();
		for(String s1:letter) {
			sb.append(s1);
			sb.append(" ");
		}
		System.out.println(sb);
	}
}
