package TMN;

import java.math.BigInteger;
import java.util.Scanner;

public class NHO_NHAT_VA_LON_NHAT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int n = sc.nextInt();
			if(n==0) break;
			BigInteger min = BigInteger.valueOf(0);
			BigInteger max = BigInteger.valueOf(0);
			for(int i=0;i<n;i++)
			{
				BigInteger tmp = sc.nextBigInteger();
				if(i==0)
				{
					min = tmp;
					max = tmp;
				}
				else
				{
					if(min.compareTo(tmp)>0) min = tmp;
					if(max.compareTo(tmp)<0) max = tmp;
				}
			}
			if(min.equals(max)==false) System.out.println(min + " " +max);
			else System.out.println("BANG NHAU");
		}
	}
}
