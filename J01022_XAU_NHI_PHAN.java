import java.util.Scanner;

public class J01022_XAU_NHI_PHAN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			long k = sc.nextLong();
			long[] f = new long[95];
			f[1]=1;
			f[2]=1;
			int m = n;
			for(int i=3;i<=m;i++)
			{
				f[i] = f[i-1] + f[i-2];
			}
			while(true)
			{
				if(n==1)
				{
					System.out.println('0');
					break;
				}
				else if (n==2)
				{
					System.out.println('1');
					break;
				}
				if(k>f[n-2])
				{
					k-=f[n-2];
					n-=1;
				}
				else
				{
					n-=2;
				}
			}
		}
	}
}
