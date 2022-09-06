import java.util.ArrayList;
import java.util.Scanner;

public class TMN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			ArrayList<Long> arr = new ArrayList<Long>();
			for(int i=0;i<n;i++)
			{
				arr.add(sc.nextLong());
			}
			boolean check = false;
			for(int i=0;i<n-1;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					long tmp = arr.get(i)*arr.get(i) + arr.get(j)*arr.get(j);
					long res = (long) Math.sqrt(tmp);
					if(res*res==tmp&&arr.contains(res))
					{
						check = true;
						break;
					}
				}
				if(check) break;
			}
			if(check) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
