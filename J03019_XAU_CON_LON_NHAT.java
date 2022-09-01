import java.util.Scanner;
import java.util.Stack;

public class J03019_XAU_CON_LON_NHAT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Stack<Character> st = new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(st.isEmpty()==true)
			{
				st.add(s.charAt(i));
			}
			else
			{
				while(st.size()>0&&s.charAt(i)>st.lastElement())
				{
					st.pop();
				}
				st.add(s.charAt(i));
			}
		}
		s = "";
		for(Character i: st)
		{
			System.out.print(i);
		}
		System.out.println();
	}
}
