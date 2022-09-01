import java.util.Scanner;

public class J03023_SO_LA_MA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			char x[] = {'I','V','X','L','C','D','M'};
			int a[] = {1,5,10,50,100,500,1000};
			long ans = 0;
			for(int i=0;i<7;i++)
			{
				if(x[i]==s.charAt(0))
				{
					ans += a[i];
					break;
				}
			}
			for(int i=1;i<s.length();i++)
			{
				int lc1 = 0,lc2=0;
				for(int j=0;j<7;j++)
				{
					if(s.charAt(i) == x[j])
					{
						lc2 = j;
					}
					if(s.charAt(i-1)== x[j])
					{
						lc1 = j;
					}
				} 
				if(lc2-lc1==1||lc2-lc1==2)
				{
					ans= ans - 2*a[lc1] + a[lc2];
				}
				else
				{
					ans+=a[lc2];
				}
			}
			System.out.println(ans);
		}
	}
}
