import java.util.Scanner;

public class J03004_CHUAN_HOA_HO_TEN_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			
			String s = sc.nextLine();
			s = s.trim();
			char x[] = new char[10001];
			String str = "";
			for(int i=0;i<s.length();i++)
			{
				x[i] = s.charAt(i);
				if(i>0&&x[i-1]==' '&&x[i]!=' ') System.out.print(" ");
				if(i==0||x[i]>='a'&&x[i]<='z'&&x[i-1]==' ')
				{
					x[i]-=32;
				}
				else if(x[i]>='A'&&x[i]<='Z'&&x[i-1]!=' ')
				{
					x[i]+=32;
				}
				if(x[i]!=' ') System.out.print(x[i]);
			}
			System.out.println();
		}
	}
}
