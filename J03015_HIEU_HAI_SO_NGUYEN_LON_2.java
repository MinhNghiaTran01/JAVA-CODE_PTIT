import java.math.BigInteger;
import java.util.Scanner;

public class J03015_HIEU_HAI_SO_NGUYEN_LON_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			BigInteger max = a.max(b);
			BigInteger min = a.min(b);
			System.out.println(a.subtract(b));
	}
}
