import java.util.Scanner;

public class J03025_XAU_DOI_XUNG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			int cnt = 0;
			int n = s.length();
			for(int i=0;i<n/2;i++)
			{
				if(s.charAt(i)!=s.charAt(n-i-1))
				{
					cnt++;
				}
			}
			if(n%2==1&&cnt==0) cnt++; 
			if(cnt==1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
