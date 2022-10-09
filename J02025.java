import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class J02025 {
	static int a[];
	static Vector<String> v;
	static boolean check(int sum)
	{
		for(int i=2;i<=(int)Math.sqrt(sum);i++)
		{
			if(sum%i==0) return false;
		}
		if(sum<2) return false;
		return true;
	}
	public static void ql(int k,String s,int sum)
	{
		if(check(sum)&&s.length()>0)
		{
			String tmp[] = s.split(" ");
			String ans = "";
			for(int i=0;i<tmp.length;i++)
			{
				if(tmp[i].length()==0||tmp[i]==" ") continue;
				while(tmp[i].length()<3) tmp[i] = "0" + tmp[i];
				ans+=tmp[i] + " ";
			}
			if(v.contains(ans)==false) v.add(ans);
		}
		for(int i=k;i>=0;i--)
		{
			String tmp = s;
			sum+=a[i];
			s+= String.valueOf(a[i]) + " ";
			ql(i-1,s,sum);
			s=tmp;
			sum-=a[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			v = new Vector<String>();
			int n = sc.nextInt();
			a = new int[n];
			for(int i=0;i<n;i++)
			{
				a[i] = sc.nextInt();
			}
			Arrays.sort(a);
			for(int i=0;i<n;i++)
			{
				ql(i,"",0);
			}
			v.sort(null);
			for(String s:v)
			{
				String tmp[] = s.split(" ");
				for(int i=0;i<tmp.length;i++)
				{
					while(tmp[i].charAt(0)=='0') tmp[i] = tmp[i].substring(1);
					System.out.print(tmp[i] + " ");
				}
				System.out.println();
			}
		}
	}
}
