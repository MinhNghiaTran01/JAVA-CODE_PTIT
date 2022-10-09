import java.util.Map;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;
class pair
{
	int k,v;

	public pair(int k, int v) {
		this.k = k;
		this.v = v;
	}
	
}
public class J03020 {
	public static int check(String s)
	{
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) return 0;
		}
		return 1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		Vector<String> v_key = new Vector<String>();
		Vector<Integer> v_value = new Vector<Integer>();
		while(sc.hasNext())
		{
			try
			{
				String s = sc.next();
				if(check(s)==1)
				{
					if(s.length()>max)
					{
						max = s.length();
						v_key.clear();
						v_value.clear();
						v_key.add(s);
						v_value.add(1);
					}
					else if(s.length()==max)
					{
						if(v_key.contains(s))
						{
							int index = v_key.indexOf(s);
							v_value.set(index, v_value.get(index)+1);
						}
						else
						{
							v_key.add(s);
							v_value.add(1);
						}
					}
				}
			}
			catch (Exception e) {
				break;
			}
		}
		for(int i=0;i<v_key.size();i++)
		{
			System.out.println(v_key.get(i) + " " + v_value.get(i));
		}
		
	}
}
