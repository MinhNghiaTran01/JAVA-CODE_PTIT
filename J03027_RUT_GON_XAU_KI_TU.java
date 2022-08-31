import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class J03027_RUT_GON_XAU_KI_TU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Deque<Character> dq = new ArrayDeque<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(dq.isEmpty()==true)
			{
				dq.offerLast(s.charAt(i));
			}
			else if (dq.peekLast()==s.charAt(i))
			{
				dq.pollLast();
			}
			else dq.offerLast(s.charAt(i));
		}
		if(dq.isEmpty()==true) System.out.println("Empty String");
		else
		{
			while(dq.isEmpty()!=true)
			{
				System.out.print( dq.peekFirst() );
				dq.pollFirst();
			}
		}
	}
}
