import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class J02024 {
	static int a[];
	static Set<String> set;
	public static void ql(int i,String s,int sum)
	{
		if(sum%2!=0&&s.length()>0)
		{
			if(!set.contains(s))
			{
				set.add(s);
				System.out.println(s);
			}
			
		}
		if(i==-1) return;
		for(int j=1;j<=2;j++)
		{
			if(j==2)
			{
				sum+=a[i];
				s += String.valueOf(a[i]) + " ";
				ql(i-1,s,sum);
			}
			if(j==1) ql(i-1,s,sum);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			set = new HashSet<String>();
			int n = sc.nextInt();
			a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			ql(n-1,"",0);
		}
	}
}
