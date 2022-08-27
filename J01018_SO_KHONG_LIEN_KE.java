import java.util.Scanner;

public class J01018_SO_KHONG_LIEN_KE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			boolean check = false;
			int sum=0;
			for(int i=1;i<s.length();i++)
			{
				int a = s.charAt(i) - '0';
				int b = s.charAt(i-1) - '0';
				if(Math.abs(a-b)!=2)
				{
					check=true;
					break;
				}
				sum+= a;
			}
			sum+= s.charAt(0) - '0';
			if(check || sum%10!=0)	System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
