import java.util.Scanner;

public class J02014_DIEM_CAN_BANG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int a[] = new int[n+1];
			long sum=0;
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			long sum_left = a[0];
			boolean check = false;
			for(int i=1;i<n-1;i++)
			{
				if(sum-sum_left - a[i] == sum_left)
				{
					check = true;
					System.out.println(i+1);
					break;
				}
				sum_left+=a[i];
			}
			if(!check) System.out.println(-1);
		}
		
	}
}
