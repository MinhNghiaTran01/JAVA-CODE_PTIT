import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class TMN {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new FileReader("DATA.in"));
		String s ="";
		BigInteger a = BigInteger.valueOf(0);
		while((s=bf.readLine())!=null)
		{
			String str[] = s.split("\\s");
			for(int i=0;i<str.length;i++)
			{
				if(str[i].length()>0&&Character.isDigit(str[i].charAt(0)))
				{
					if(str[i].length()<10) 
					{
						BigInteger res = new BigInteger(str[i]);
						a = a.add(res);
						
					}
				}
			}
		}
		System.out.println(a.longValue());
	}
}
