import java.util.Scanner;

public class J01012_Uoc_So_Chia_Het_Cho_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int cnt_2=0;
			for(int i=2;i<=Math.sqrt(n)+1;i++)
			{
				if (n%i==0)
				{
					if (i%2==0) cnt_2++;
					if ( (n/i)%2==0 && n/i!=i) cnt_2++;
				}
			}
			if(n%2==0) cnt_2++;
			System.out.println(cnt_2);
		}
	}
}
