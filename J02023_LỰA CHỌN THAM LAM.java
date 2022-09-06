import java.util.Scanner;

public class TMN {
	static void min(int n,int s)
	{
		if(s==0) 
		{
			System.out.print(-1 + " ");
			return;
		}
		String str = "";	s-=1;
		while(n-->0)
		{
			if(s>=9)	
			{
				str = "9" + str;
				s-=9;
			}
			else
			{
				str = String.valueOf(s) + str;
				s=0;
			}
		}
		if(s>0)	System.out.print(-1 + " ");
		else
		{
			int tmp = str.charAt(0) - '0';
			str = str.substring(1);
			if(tmp==9)	System.out.print("10" + str + " " );
			else 		System.out.print(tmp+1 + str + " ");
		}
	}
	static void max(int n,int s)
	{
		if(s==0) 
		{
			System.out.println(-1);
			return;
		}
		String str = "";
		while(n-->0)
		{
			if(s>=9) 
			{
				str = "9" + str;
				s-=9;
			}
			else
			{
				str += String.valueOf(s);
				s=0;
			}
		}
		if(s>0)	System.out.println(-1);
		else	System.out.println(str);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s = sc.nextInt();
		min(n,s); 
		max(n,s);
	}
}
