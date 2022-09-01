import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class J03020_TU_THUAN_NGHICH_DAI_NHAT {
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
		Stack<String> st = new Stack<String>();
		int dem=0;
		while(sc.hasNext())
		{
			String s = sc.next();
			if(s.isEmpty()) break;
			if(check(s)==1)
			{
				while(st.size()>0&&s.length()>st.lastElement().length())
				{
					st.pop();
				}
				if(st.size()==0||s.length()==st.firstElement().length())
				{
					st.add(s);
					if(s.equals(st.firstElement())) dem++;
				}
			}
		}
		Vector<String> v = new Vector<String>();
		while(st.size()>0)
		{
			v.add(st.firstElement());
			st.remove(0);
		}
		if(dem>0)
		{
			for(String i :v) System.out.print(i + " ");
		}
		
		System.out.print(v.elementAt(0) + " " + v.size());
	}
}
