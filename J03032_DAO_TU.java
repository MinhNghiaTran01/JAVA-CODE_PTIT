import java.util.Scanner;
import java.util.StringTokenizer;

public class J03032_DAO_TU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			while(st.hasMoreTokens())
			{
				String tmp = st.nextToken();
				StringBuilder sb = new StringBuilder(tmp);
				sb.reverse();
				System.out.print(sb + " ");
			}
			System.out.println();
		}
	}
}
