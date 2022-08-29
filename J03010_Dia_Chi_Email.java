import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03010_Dia_Chi_Email {
	public static void add(Map<String, Integer> map,String ans)
	{
		if(map.containsKey(ans))
		{
			int count = map.get(ans) + 1;
			map.put(ans, count);
		}
		else
		{
			map.put(ans, 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Map<String, Integer> map = new HashMap<String, Integer>();
		sc.nextLine();
		while(t-->0)
		{
			Set<String> set = new TreeSet<String>();
			String s = sc.nextLine();
			s = s.trim();
			String[] word = s.split(" ");
			word[word.length-1] = word[word.length-1].toLowerCase();
			System.out.print(word[word.length-1]);
			String ans = "";
			for(int i=0;i<word.length-1;i++)
			{
				if(word[i].length()>0)
				{
					word[i] = word[i].toLowerCase();
					ans+= word[i].charAt(0);
				}
			}
			add(map,ans);
			if(map.get(ans)>1) System.out.print(ans + map.get(ans));
			else System.out.print(ans);
			System.out.println("@ptit.edu.vn");
		}
	}
}
