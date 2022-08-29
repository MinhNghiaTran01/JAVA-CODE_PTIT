import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HIEU_SO_NGUYEN_LON_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger max = a.max(b);
			BigInteger min = a.min(b);
			BigInteger mod = BigInteger.valueOf(10);
			BigInteger tmp = BigInteger.valueOf(0);
			int cnt = 0;
			while(b.compareTo(tmp)!=0)
			{
				b = b.divide(mod);
				cnt++;
			}
			a = max.subtract(min);
			b = a; 
			while(a.compareTo(tmp)!=0)
			{
				a = a.divide(mod);
				cnt--;
			}
			while(cnt-->0)
			{
				System.out.print("0");
			}
			System.out.println(b);
		}
	}
}
