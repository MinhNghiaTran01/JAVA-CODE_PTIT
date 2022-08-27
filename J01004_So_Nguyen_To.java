import java.util.Scanner;

public class So_Nguyen_To {
	//private static final boolean false = false;
	public static boolean snt(int n)
	{
		for(int i=2;i<=Math.sqrt(n)+1;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return n>1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0)
		{
			int n = sc.nextInt();
			if (snt(n))
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
		}
	}
}
