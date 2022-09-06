import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class TMN {
	static int[] a = new int[1000001];
	static void Prime()
	{
		Arrays.fill(a, 1);
		a[0]=0; a[1] = 0;
		for(int i=2;i*i<=1000000;i++)
		{
			if(a[i]==1)
			{
				for(int j=i*i;j<=1000000;j+=i)
				{
					a[j] = 0;
				}
			}
		}
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Prime();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
		int [] f = new int[1000001];
		for(int i=0;i<arr.size();i++)	
		{
				f[arr.get(i)]+=a[arr.get(i)];
		}
		int cnt=0;
		for(int i=1000000;i>=2;i--)
		{
			if(f[i]>0) 
			{
				System.out.println(i + " " + f[i]);
				cnt++;
			}
			if(cnt==10) break;
		}
	}
}