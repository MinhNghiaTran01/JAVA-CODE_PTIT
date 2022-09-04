import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DATA.in"));
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		while(sc.hasNext())
		{
			int a = sc.nextInt();
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
