import java.util.Arrays;
import java.util.Scanner;

public class J01013_TONG_UOC_SO_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[2000001];
		Arrays.fill(a,0);
		a[1] = 1;
		for(int i=2;i<Math.sqrt(2000001);i++)
		{
			if(a[i]==0)
			{
				for(int j=i*i;j<2000001;j+=i)
				{
					a[j]=1;
				}
			}
		}
		long sum=0;
		for (int i=1;i<=n;i++)
		{
			int res = sc.nextInt();
			if(a[res]==0) sum+=res;
			else
			{
				for(int j=2;j<=Math.sqrt(res);j++)
				{
					while(res%j==0)
					{
						sum+=j;
						res/=j;
					}
					if(a[res]==0)
					{
						break;
					}
				}
				if (res>1)
				{
					sum+=res;
				}
			}
		}
		System.out.println(sum);
	}
}
