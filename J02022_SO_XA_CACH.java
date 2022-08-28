import java.util.Scanner;

public class J02022_SO_XA_CACH {
	public static void liet_ke(int n,int cnt,int luu[],int check[])
	{
		if(cnt==n)
		{
			for(int i=0;i<n;i++) System.out.print(luu[i]);
			System.out.println();
			return;
		}
		for(int i=1;i<=n;i++)
		{
			if(cnt==0 || (check[i]==0 && Math.abs(luu[cnt-1] - i)>1))
			{
				check[i] = 1;
				luu[cnt] = i;
				liet_ke(n,cnt+1, luu, check);
				check[i] = 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int luu[] = new int[11];
			int check[] = new int[11];
			liet_ke(n,0, luu, check);
		}
	}
}
