
import java.util.Scanner;

class Pair<T1,T2>
{
    Integer a,b;

    public Pair(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }
    public boolean isPrime()
    {
        boolean check =true;
        if(a<2||b<2) check = false;
        for(int i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
            {
                check =false;
                break;
            }
        }
        for(int i=2;i<=(int)Math.sqrt(b);i++)
        {
            if(b%i==0)
            {
                check =false;
                break;
            }
        }
        return check;
    }
    public String toString()
    {
    	String tmp = String.valueOf(a) + " " + String.valueOf(b);
    	return tmp;
    }
}
public class J04020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
