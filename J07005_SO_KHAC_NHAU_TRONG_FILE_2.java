import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class TMN {
	public static void main(String[] args) throws IOException {
		DataInputStream input = new DataInputStream(new FileInputStream("DATA.IN"));
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for(int i=0;i<100000;i++)
		{
			Integer a = input.readInt();
			if(map.containsKey(a)==false)
			{
				map.put(a,1);
			}
			else
			{
				Integer x = map.get(a);
				 x+=1;
				 map.put(a, x);
			}
		}
		for(Map.Entry<Integer, Integer>entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
