import java.util.Scanner;

public class J02004_MANG_DOI_XUNG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int []a = new int[n+1];
			boolean check = false;
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			for(int i=0;i<n/2;i++)
			{
				if(a[i]!=a[n-i-1])
				{
					check=true;
					break;
				}
			}
			if(check) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
