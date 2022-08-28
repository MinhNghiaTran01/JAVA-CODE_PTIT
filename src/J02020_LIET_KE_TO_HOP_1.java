import java.util.Arrays;
import java.util.Scanner;

public class J02020_LIET_KE_TO_HOP_1 {
	static int dem;
	public static void liet_ke_to_hop(int[] a,int n,int k,int cnt,int j,int b[])
	{
		if(cnt==k)
		{
			dem++;
			for(int i=0;i<k;i++) System.out.print(b[i] + " ");
			System.out.println();
			return;
		}
		for(int i=j;i<n;i++)
		{
			b[cnt] = a[i];
			liet_ke_to_hop(a, n, k, cnt+1,i+1, b);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	
		int k = sc.nextInt();
		int a[] = new int[n+1];
		int b[] = new int[k+1];
		for(int i=0;i<n;i++) a[i] = i+1;
		dem=0;
		liet_ke_to_hop(a, n, k,0,0,b);
		System.out.print("Tong cong co " + dem + " to hop");
	}
}
