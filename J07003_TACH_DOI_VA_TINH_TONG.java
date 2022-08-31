import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003_TACH_DOI_VA_TINH_TONG {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		BigInteger a = sc.nextBigInteger();
		while(true)
		{
			String s = a.toString();
			if(s.length()==1) break;
			String s1 = s.substring(0,s.length()/2);
			String s2 = s.substring(s.length()/2);
			BigInteger n1 = new BigInteger(s1);
			BigInteger n2 = new BigInteger(s2);
			a = n1.add(n2);
			System.out.println(a);
		}
		sc.close();
	}
}
