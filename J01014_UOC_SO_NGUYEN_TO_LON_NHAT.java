import java.util.Scanner;

public class J01014_UOC_SO_NGUYEN_TO_LON_NHAT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0)
		{
			long ans=0;
			long n = sc.nextLong();
			for(int i=2;i<=Math.sqrt(n);i++)
			{
				while(n%i==0)
				{
					n/=i;
					ans = Math.max(ans,i);
				}
			}
			ans = Math.max(ans, n);
			System.out.println(ans);
		}
		
	}
}
