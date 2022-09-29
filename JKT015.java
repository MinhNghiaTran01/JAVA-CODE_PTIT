
import java.util.Scanner;
import java.util.Stack;

public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> s1 = new Stack<Character>();
        Stack<Character> s2 = new Stack<Character>();
        for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='<')
        	 {
        		 if(s1.size()>0)
        		{
        			 s2.push(s1.pop());
        		}
        	 }
             else if(str.charAt(i)=='>')
             {
            	 if(s2.size()>0)
            	 {
            		 s1.push(s2.pop());
            	 }
             }
             else if(str.charAt(i)=='-')
             {
             	if(s1.size()>0) s1.pop();
             }
             else 
             {
            	 s1.push(str.charAt(i));
             }
        }
        String ans = "";
        while(s1.size()>0)
        {
        	s2.push(s1.pop());
        }
        while(s2.size()>0)
        {
        	System.out.print(s2.pop());
        }
    }
}
