import java.math.BigInteger;
import java.util.Scanner;

public class J03039_CHIA_HET {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger max = a.max(b);
			BigInteger min = a.min(b);
			if(max.gcd(min).equals(min))
			{
				System.out.println("YES");
			}
			else System.out.println("NO");
		}
	}
}
