import java.util.Scanner;

public class J03040 {
	static int tang_dan(String str)
	{
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)<=str.charAt(i-1)) return 0;
		}
		return 1;
	}
	static int giong_nhau(String str)
	{
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)!=str.charAt(i-1)) return 0;
		}
		return 1;
	}
	static int ba_dau_hai_cuoi(String str)
	{
		for(int i=1;i<str.length()-2;i++)
		{
			if(str.charAt(i)!=str.charAt(i-1)) return 0;
		}
		if(str.charAt(str.length()-2)!=str.charAt(str.length()-1)) return 0;
		return 1;
	}
	static int so_loc_phat(String str)
	{
		for(int i=1;i<str.length()-2;i++)
		{
			if(str.charAt(i)!='6'&&str.charAt(i)!='8') return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String str = sc.next();
			str = str.substring(5,8) + str.substring(9);
			if(giong_nhau(str)==1||tang_dan(str)==1||ba_dau_hai_cuoi(str)==1||so_loc_phat(str)==1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
