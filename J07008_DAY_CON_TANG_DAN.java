import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class J07008_DAY_CON_TANG_DAN {
	public static void duyet(ArrayList<String> ar,int i,int n,BigInteger max,BigInteger a[],String s)
	{
		for(int j=i;j<n;j++)
		{
			if(i==0)
			{
				s = a[j].toString();
				max = a[j];
				duyet(ar,j+1,n,max,a,s);
			}
			else if(a[j].compareTo(max)>0)
			{
				String tmp = s;
				s+= " " + a[j].toString();
				BigInteger tmp_max = max;
				max = a[j];
				ar.add(s);
				duyet(ar,j+1,n,max,a,s);
				s = tmp;
				max = tmp_max;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("DAYSO.in"));
		int n = sc.nextInt();
		BigInteger a[] = new BigInteger[101];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextBigInteger();
		}
		ArrayList<String> ar = new ArrayList<String>();
		String s = "";
		duyet(ar,0,n,a[0],a,s);
		ar.sort(Comparator.naturalOrder());
		for(String i : ar)
		{
			System.out.println(i);
		}
		sc.close();
	}
}
