package ionixx;
import java.util.*;

public class repitition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("conversation.......");
		do
		{
			
			String s=sc.next();
			al.add(s);
			if(s.equalsIgnoreCase("quit"))
			{
				break;
			}
			
		}while(true);
		System.out.println("please enter question number 1/2/3");
		int x=sc.nextInt();
		if(x==1)
		{
			int count1=1;
			String s=al.get(0);
			char a[]=s.toCharArray();
			for(int i=0;i<s.length();i++)
			{
				for(int j=i+1;j<s.length();j++)
				{
					if(a[i]==a[j])
					{
						count1++;
					}
				}
			}
			System.out.print(a[0]+" "+count1);
			
		}
		else if(x==2)
		{
			int count=0;
			String a="";
			for(int i=0;i<al.size();i++)
			{
				a=al.get(0);
				if(a.equals(al.get(i)))
				{
					count++;
				}
			}
			System.out.println(a+" "+count);
			int count1=0;
			String b="";
			for(int i=0;i<al.size();i++)
			{
				b=al.get(1);
				if(b.equals(al.get(i)))
				{
					count1++;
				}
			}
			System.out.println(b+" "+count1);
			
		}
		else if(x==3)
		{
		System.out.println("Length of the conversation");
		System.out.println(al.size());
		}
		else
		{
			System.out.println("please enter the valid question");
		}
	}

}