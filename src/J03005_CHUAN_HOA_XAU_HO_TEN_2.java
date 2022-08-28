import java.util.Scanner;

public class J03005_CHUAN_HOA_XAU_HO_TEN_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			String s = sc.nextLine();
			s = s.trim();
			char x;
			String str1 = "";
			String str2 = "";
			int index = -1;
			for(int i=0;i<s.length();i++)
			{
				x = s.charAt(i);
				if(x==' ') index = i ;
				if(i==0&&x>='a'&&x<='z'||i>0&&x>='a'&&x<='z'&&s.charAt(i-1)==' ')
				{
					x-=32;
				}
				else if(i>0&&s.charAt(i-1)!=' '&&x>='A'&&x<='Z')
				{
					x+=32;
				}
				if(index!=-1&&s.charAt(i-1)==' '&&s.charAt(i)!=' ') 
				{
					str2+=' ';
				}
				if(index==-1) str1+=x;
				else if(index!=-1&&x!=' ')
				{
					str2+=x;
				}
			}
			str2 = str2.trim();
			str2+=", ";
			str1 = str1.toUpperCase();
			System.out.println(str2 + str1);
		}
	}
}
