import java.util.Scanner;

public class J02034_BO_SUNG_DAY_SO {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[1000];
		int max=0;
		for(int i=0;i<n;i++)
		{
			int res = sc.nextInt();
			if(i==n-1) max = res;
			a[res] = 1;
		}
		int cnt=0;
		 boolean check = false;
		for(int i=1;i<=max;i++)
		{
			if(a[i]==0) 
			{
				System.out.println(i);
				check=true;
			}
		}
		if(!check) System.out.println("Excellent!");
	}
}
