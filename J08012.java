import java.util.Scanner;
import java.util.Vector;

public class J08012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer> v[] = (Vector<Integer>[]) new Vector[100001];
		for(int i=1;i<100001;i++)
		{
			v[i] = new Vector<Integer>();
		}
		for(int i=1;i<n;i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			v[a].add(b);
			v[b].add(a);
		}
		int cnt=0;
		for(int i=1;i<100001;i++)
		{
			if(v[i].size()==n-1)
			{
				cnt++;
				continue;
			}
		}
		if(cnt==1) System.out.println("Yes");
		else System.out.println("No");
	}
}
