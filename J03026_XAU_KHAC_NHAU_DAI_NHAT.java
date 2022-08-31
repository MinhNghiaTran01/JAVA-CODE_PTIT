import java.util.Scanner;

public class J03026_XAU_KHAC_NHAU_DAI_NHAT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String a = sc.next();
			String b = sc.next();
			if(a.length()!=b.length()) System.out.println(Math.max(a.length(), b.length()));
			else if(a.equals(b)) System.out.println(-1);
			else System.out.println(a.length());
		}
	}
}
