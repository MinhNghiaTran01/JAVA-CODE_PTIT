import java.util.Scanner;

public class J03024_SO_UU_THE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			boolean check = true;
			int cnt_chan = 0;
			int cnt_le = 0;
			if(s.charAt(0)=='0')
			{
				System.out.println("INVALID");
				continue;
			}
			for(int i=0;i<s.length();i++)
			{
				int tmp = s.charAt(i) - '0';
				if(s.charAt(i)<'0'||s.charAt(i)>'9')
				{
					check=false;
					break;
				}
				if(tmp%2==0) cnt_chan++;
				else cnt_le++;
			}
			if (check==false) System.out.println("INVALID");
			else if(cnt_chan > cnt_le && s.length()%2==0) System.out.println("YES");
			else if(cnt_le > cnt_chan && s.length()%2==1) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
