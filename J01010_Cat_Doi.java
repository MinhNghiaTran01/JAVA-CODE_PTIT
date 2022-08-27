import java.util.Scanner;

public class J01010_Cat_Doi {
	public static void Cat_Doi(String s)
	{
		String ans = "";
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)=='1')
			{
				ans+=s.charAt(i);
			}
			else if (s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9')
			{
				ans+='0';
			}
			else
			{
				System.out.println("INVALID");
				return;
			}
		}
		while (ans.length()>0&&ans.charAt(0)=='0')
		{
			ans = ans.substring(1);
		}	
		if (ans.length()>0)
		{
			System.out.println(ans);
		}
		else
		{
			System.out.println("INVALID");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0)
		{
			String s = sc.next();
			Cat_Doi(s);
		}
	}
}
