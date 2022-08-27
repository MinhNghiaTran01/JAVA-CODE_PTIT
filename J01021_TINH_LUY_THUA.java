import java.util.Scanner;

public class J01021_TINH_LUY_THUA {
	public static long luy_thua(long a,long b,long mod)
	{
		long tmp = a;
		long ans = 1;
		while(b>=1)
		{
			if(b%2==1)
			{
				ans*=tmp;
				ans%=mod;
			}
			b/=2;
			tmp*=tmp;
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long mod = 1000000007;
		while(true)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			if (a==0&&b==0) break;
			System.out.println(luy_thua(a, b,mod));
		}
	}
}
