import java.util.Scanner;

public class J01017_SO_LIEN_KE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			boolean check = false;
			for(int i=1;i<s.length();i++)
			{
				int a = s.charAt(i) - '0';
				int b = s.charAt(i-1) - '0';
				if(Math.abs(a-b)!=1)
				{
					check=true;
					break;
				}
			}
			if(check)	System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
