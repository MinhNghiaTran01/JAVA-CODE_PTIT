import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class J07032 {
	public static int check(Integer a)
	{
		String s1 = new String();
		s1 = s1.valueOf(a);
		for(int i=0;i<s1.length();i++)
		{
			int tmp = s1.charAt(i) - '0';
			if(tmp%2==0) 
			{
				return 0;
			}
			 if(i<s1.length()/2&&s1.charAt(i)!=s1.charAt(s1.length()-i-1)) return 0;
		}
		if(s1.length()>1&&s1.length()%2!=0) return 1;
		return 0;
	}
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException 
	{
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ObjectInputStream osi1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
		ObjectInputStream osi2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
		ar1 = (ArrayList<Integer>) osi1.readObject();
		ar2 = (ArrayList<Integer>) osi2.readObject();
//		ar1.add(Integer.valueOf(939));
//		ar1.add(Integer.valueOf(939));
//		ar2.add(Integer.valueOf(939));
//		ar2.add(Integer.valueOf(11311));
		int cnt = 0;
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int i=0;i<ar1.size();i++)
		{
			if(hs.contains(ar1.get(i))==false&&check(ar1.get(i))==1&&ar2.contains(ar1.get(i)))
			{
				int value = Collections.frequency(ar1, ar1.get(i)) + Collections.frequency(ar2, ar1.get(i));
				map.put(ar1.get(i), value);
				cnt++;
				hs.add(ar1.get(i));
			}
			if(cnt==10) break;
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue() );
		}
	}
}
