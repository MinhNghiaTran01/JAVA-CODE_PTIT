import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class TMN {
	static boolean check(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0) return false;
		}
		if(n>1) return true;
		return false;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
		ArrayList<Integer> arr = (ArrayList<Integer>) ois.readObject();
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<arr.size();i++)
		{
			if(check(arr.get(i)))
			{
				if(map.containsKey(arr.get(i)))
				{
					int cnt = map.get(arr.get(i));
					map.put(arr.get(i),cnt+1);
				}
				else map.put(arr.get(i), 1);
			}
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
