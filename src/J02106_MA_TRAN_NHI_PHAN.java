import java.util.Scanner;

public class J02106_MA_TRAN_NHI_PHAN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n+1][5];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int cnt_0=0;
			int cnt_1=1;
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==0) cnt_0++;
				else cnt_1++;
			}
			if(cnt_1>cnt_0) ans++;
		}
		System.out.println(ans);
	}
}
