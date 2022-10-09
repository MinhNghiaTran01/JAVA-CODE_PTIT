import java.util.Scanner;

public class J02028 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            long k = sc.nextLong();
            Long  a[] = new Long[n];
            for(int i=0;i<n;i++) a[i] = sc.nextLong();
            long sum = 0;
            boolean check = false;
            int i = 0;
            for(int j=0;j<n;j++)
            {
                sum+=a[j];
                while(sum>k)
                {
                    sum-=a[i];i++;
                }
                if(sum==k&&i!=j+1)
                {
                    check = true;break;
                }
            }
            if(check==true) System.out.println("YES");
            else System.out.println("NO");
        }
}
}