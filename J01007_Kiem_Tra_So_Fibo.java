
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiem_Tra_So_Fibo {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			Long F[] = new Long[93];
			F[0]= Long.valueOf(0);
			F[1]= Long.valueOf(1); F[2]=Long.valueOf(1);
			for(int i=3;i<=92;i++)
			{
				F[i] = F[i-1] + F[i-2];
			}
			while (t-->0)
			{
				long n = sc.nextLong();
				boolean check = Arrays.asList(F).contains(Long.valueOf(n));
				if (check==true)
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
}
