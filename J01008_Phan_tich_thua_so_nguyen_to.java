import java.util.Scanner;

public class Phan_tich_thua_so_nguyen_to {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int t = sc.nextInt();
		int dem=1;
		while(t-->0)
		{
			int n = sc.nextInt();
			System.out.printf("%s %d%s ","Test",dem,":");
			for(int i=2;i<=Math.sqrt(n)+1;i++)
			{
				int cnt=0;
				while (n%i==0)
				{
					cnt+=1;
					n/=i;
				}
				if (cnt>0)
				{
					System.out.printf("%d%s%d%s",i,"(",cnt,") ");
				}
			}
			if (n>1)
			{
				System.out.printf("%d%s%d%s",n,"(",1,") ");
			}
			System.out.println();
			dem++;
		}
	}
}
