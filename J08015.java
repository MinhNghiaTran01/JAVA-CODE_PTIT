import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class J08015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			TreeSet<Integer> ts = new TreeSet<Integer>();
			for(int i=1;i<=n;i++)
			{
				ts.add(sc.nextInt());
			}
			int ans=0;
			
			for(Integer i:ts)
			{
				if(ts.contains(k-i))
				{
					ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
