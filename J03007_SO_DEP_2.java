import java.util.Scanner;

public class J03007_SO_DEP_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			if(s.charAt(0)!='8'||s.charAt(s.length()-1)!='8')
			{
				System.out.println("NO");
				continue;
			}
			boolean check = true;
			int sum = 0;
			if(s.length()%2!=0)
			{
				sum+= s.charAt(s.length()/2) - '0';
			}
			for(int i=0;i<s.length()/2;i++)
			{
				sum+= s.charAt(i) - '0' + s.charAt(s.length()-i-1) - '0';
				if(s.charAt(i)!=s.charAt(s.length()-i-1))
				{
					check = false;
				}
			}
			if(check&&sum%10==0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
