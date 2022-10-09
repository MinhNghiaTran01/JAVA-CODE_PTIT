import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
class TMN
{
	int cnt;
	String s;
	public TMN(String str, int cnt) {
		this.s = str;
		this.cnt = cnt;
	}
}
public class J08025 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String str1 = "";
			String str2 = "";
			for(int i=0;i<6;i++) str1+=sc.next();
			for(int i=0;i<6;i++) str2+=sc.next();
			if(str1.equals(str2))
			{
				System.out.println(0);
				continue;
			}
			Queue<TMN> q = new ArrayDeque<TMN>();
			q.add(new TMN(str1,0));
			while(q.size()>0)
			{
				TMN tmp = q.poll();
				String s = tmp.s;
				int cnt = tmp.cnt+1;
				str1="";
				str1 = "" +  s.charAt(3) + s.charAt(0) + s.charAt(2) + s.charAt(4) + s.charAt(1) + s.charAt(5);
				if(str1.equals(str2))
				{
					System.out.println(cnt);
					break;
				}
				q.add(new TMN(str1, cnt));
				str1="";
				str1 = "" +  s.charAt(0) + s.charAt(4) + s.charAt(1) + s.charAt(3) + s.charAt(5) + s.charAt(2);
				if(str1.equals(str2))
				{
					System.out.println(cnt);
					break;
				}
				q.add(new TMN(str1, cnt));
			}
		}
	}
}
