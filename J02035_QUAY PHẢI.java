import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TMN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			ArrayList<BigInteger> ar = new ArrayList<BigInteger>();
			long compare = (long) Math.pow(10, 18);
			for(int i=0;i<n;i++)
			{
				ar.add(sc.nextBigInteger());
				compare = Math.min(compare, ar.get(i).longValue());
			}
			for(int i=0;i<n;i++)
			{
				if(ar.get(i).equals(BigInteger.valueOf(compare)))
				{
					System.out.println(i);
					break;
				}
			}
		}
	}
}
