import java.util.Scanner;

public class J03028_MA_HOA_DRM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		char x[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I' ,'J', 'K', 'L', 'M', 'N', 'O', 'P','Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X','Y', 'Z'};
		int a[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26};
		while(t-->0)
		{
			String s = sc.next();
			StringBuilder sb = new StringBuilder(s);
			int sum1=0;
			int sum2=0;
			for(int i=0;i<sb.length();i++)
			{
				int lc = 0;
				for(int j=0;j<26;j++)
				{
					if(x[j]==sb.charAt(i))
					{
						lc = j;
						break;
					}
				}
				if(i<sb.length()/2) 
				{
					sum1+=a[lc] - 1;
				}
				else sum2+=a[lc] - 1;
			}
			for(int i=0;i<sb.length();i++)
			{
				int lc = 0;
				for(int j=0;j<26;j++)
				{
					if(x[j]==sb.charAt(i))
					{
						lc = j;
						break;
					}
				}
				if(i<sb.length()/2)
				{
					int tmp = sum1 + lc; 
					int mod = tmp/26;
					tmp = tmp - mod*26;
					sb.setCharAt(i, x[tmp]);
				}
				else	
				{
					int tmp = sum2 + lc; 
					int mod = tmp/26;
					tmp = tmp - mod*26;
					sb.setCharAt(i, x[tmp]);
				}
			}
			for(int i=0;i<sb.length()/2;i++)
			{
				int lc1 =0;
				int lc2 =0;
				for(int j=0;j<26;j++)
				{
					if(x[j]==sb.charAt(i))
					{
						lc1 = j;
					}
					if(x[j]==sb.charAt(sb.length()/2+i))
					{
						lc2 = j;
					}
				}
				int sum = a[lc1] + a[lc2] - 2;
				if(sum>25)
				{
					sum = sum - 26;
					sb.setCharAt(i, x[sum]);
				}
				else
				{
					sb.setCharAt(i, x[sum]);
				}
			}
			for(int i=0;i<sb.length()/2;i++) System.out.print(sb.charAt(i));
			System.out.println();
		}
	}
}
