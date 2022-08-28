import java.util.Scanner;

public class J02103_TICH_MA_TRAN_VOI_CHUYEN_VI_CUA_NO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int cnt=1;cnt<=t;cnt++)
		{
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n+1][m+1];
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
			System.out.println("Test " + cnt + ":");
			for(int i=0;i<n;i++)
			{
				for(int k=0;k<n;k++)
				{
					int sum = 0;
					for(int j=0;j<m;j++)
					{
						sum+= a[i][j] * a[k][j];
					}
					System.out.print(sum + " ");
				}
				System.out.println();
			}
		}
	}
}
