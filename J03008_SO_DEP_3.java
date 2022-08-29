import java.util.Scanner;

public class J03008_SO_DEP_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			boolean check = true;
			for(int i=0;i<s.length()/2;i++)
			{
				char x = s.charAt(i);
				char y = s.charAt(s.length()-i-1);
				if(x!=y||(x!='2'&&x!='3'&&x!='5'&&x!='7'))
				{
					check = false;
				}
			}
			if(check)
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
