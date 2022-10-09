
import java.util.Arrays;
import java.util.Scanner;

public class J02027 {
    static int Binary_search(int l,int r,int a[],int x)
    {
        if(l>r) return l;
        int mid = (l+r)/2;
        if(a[mid]>=x)
        {
             return Binary_search(l, mid-1, a, x);
        }
        else return Binary_search(mid+1, r, a, x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) a[i]= sc.nextInt();
            Arrays.sort(a);
            long ans = 0;
            for(int i=0;i<n-1;i++)
            {
                int tmp = k+a[i];
                tmp = Binary_search(i, n-1, a, tmp);
                ans += tmp - i - 1;
            }
            System.out.println(ans);
        }
}
}