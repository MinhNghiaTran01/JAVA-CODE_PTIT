import java.util.Scanner;
import java.util.Vector;

public class J02105_DANH_SACH_KE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector< Vector<Integer> > v = new Vector<Vector<Integer>>();
		int a[][] = new int [n+1][n+1];
		for(int i=1;i<=n;i++)
		{
			Vector<Integer> tmp = new Vector<Integer>();
			for(int j=1;j<=n;j++)
			{
				a[i][j] = sc.nextInt();
				if(a[i][j]==1) tmp.add(Integer.valueOf(j));
			}
			v.add(tmp);
		}
		
		for(int i=0;i<v.size();i++)
		{
			System.out.print("List(" + (i+1) + ") = ");
			for(Integer x : v.elementAt(i)) 
			{
				System.out.print(x+ " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
