
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            Queue<String> q = new ArrayDeque<>();
            Stack<String> s = new Stack<>();
            q.offer("6");
            q.offer("8");
            while(q.size()>0)
            {
            	String tmp = q.poll();
                s.push(tmp);
                if(tmp.length()==n)
                {
                    continue;
                }
                q.offer(tmp+"6");
                q.offer(tmp+"8");
                
            }
            System.out.println(s.size());
            while(s.size()>0)
            {
                System.out.print(s.pop() + " ");
            }
            System.out.println("");
        }
    }
}
