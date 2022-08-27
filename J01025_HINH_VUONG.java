import java.util.Scanner;

public class J01025_HINH_VUONG {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x11 = sc.nextLong();
		long y11 = sc.nextLong();
		long x12 = sc.nextLong();
		long y12 = sc.nextLong();
		
		long x21 = sc.nextLong();
		long y21 = sc.nextLong();
		long x22 = sc.nextLong();
		long y22 = sc.nextLong();
		
		long x = Math.max(x12, x22) - Math.min(x11, x21);
		long y = Math.max(y22, y12) - Math.min(y11, y21);
		x = Math.max(x, y);
		System.out.println(x*x);
	}
}
