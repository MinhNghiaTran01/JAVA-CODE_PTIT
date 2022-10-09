import java.util.Scanner;
import java.util.Stack;

public class J08028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		Long[] a = new Long[ n];
		Long[] b = new Long[ n];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextLong();
			b[i] = m - a[i];
		}
		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		s1.add(-1);
		s2.add(-1);
		long max = 0;
		for(int i=0;i<n;i++)
		{
			if(s1.size()==1) s1.add(i);
			else
			{
				while(s1.size()>1&&a[s1.peek()]>a[i])
				{
					int tmp = s1.pop();
					max = Math.max(max, (long) (i-s1.peek()-1)*a[tmp] );
				}
				s1.add(i);
			}
			
			if(s2.size()==1) s2.add(i);
			else
			{
				while(s2.size()>1&&b[s2.peek()]>b[i])
				{
					int tmp = s2.pop();
					max = Math.max(max,(long) (i-s2.peek()-1)*b[tmp] );
				}
				s2.add(i);
			}
		}
		while(s1.size()>1)
		{
			int tmp = s1.pop();
			max = Math.max(max, (n-s1.peek()-1)*a[tmp]);
		}
		
		while(s2.size()>1)
		{
			int tmp = s2.pop();
			max = Math.max(max, (n-s2.peek()-1)*b[tmp]);
		}
		System.out.println(max);
	}
}
