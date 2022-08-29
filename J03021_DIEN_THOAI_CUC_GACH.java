import java.util.Scanner;

public class J03021_DIEN_THOAI_CUC_GACH {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			s = s.toLowerCase();
			String str = "";
			for(int i=0;i<s.length();i++)
			{
				char x = s.charAt(i);
				if(x=='a'||x=='b'||x=='c')	str+='2';
				else if(x=='d'||x=='e'||x=='f')	str+='3';
				else if(x=='g'||x=='h'||x=='i') str+='4';
				else if(x=='j'||x=='k'||x=='l') str+='5';
				else if(x=='m'||x=='n'||x=='o') str+='6';
				else if(x=='p'||x=='q'||x=='r'||x=='s') str+='7';
				else if(x=='t'||x=='u'||x=='v') str+='8';
				else str+='9';
			}
			boolean check = true;
			int n = str.length();
			for(int i=0;i<n/2;i++)
			{
				if(str.charAt(i)!=str.charAt(n-i-1))
				{
					check = false;
				}
			}
			if(check) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
