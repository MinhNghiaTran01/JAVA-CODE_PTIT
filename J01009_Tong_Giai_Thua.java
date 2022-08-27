import java.util.Scanner;

public class J01009_Tong_Giai_Thua {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum=0;
		long res=1;
		for(int i=1;i<=n;i++)
		{
			res*=i;
			sum+=res;
		}
		System.out.println(sum);
	}
}
