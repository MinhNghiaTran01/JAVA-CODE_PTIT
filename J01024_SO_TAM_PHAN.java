import java.util.Scanner;

public class J01024_SO_TAM_PHAN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			boolean check=false;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2')
				{
					check=true;
					break;
				}
			}
			if(check) System.out.println("NO");
			else System.out.println("YES");
		}
	}
}
