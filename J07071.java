import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
class Ten
{
	String ten,ho,ho_va_ten;

	public Ten(String ten, String ho, String ho_va_ten) {
		this.ten = ten;
		this.ho = ho;
		this.ho_va_ten = ho_va_ten;
	}
}
public class J07071 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		int n = sc.nextInt();
		Ten str[] = new Ten[n];
		String ten_viet_tat[] = new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String s = sc.nextLine();
			String tmp[] = s.split("\\s+");
			String a = "";
			for(int k=0;k<tmp.length;k++)
			{
				a+=tmp[k].charAt(0);
			}
			ten_viet_tat[i] = a;
			str[i] = new Ten(tmp[tmp.length-1], tmp[0],s);
		}
		int t = sc.nextInt();
		while(t-->0)
		{
			String s = sc.next();
			Vector<Ten> v = new Vector<Ten>();
			String tmp="";
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='.') continue;
				tmp+=s.charAt(i);
			}
			for(int i=0;i<n;i++)
			{
				if(ten_viet_tat[i].length()>tmp.length()||ten_viet_tat[i].length()<tmp.length()) continue;
				boolean check = true;
				for(int k=0;k<tmp.length();k++)
				{
					if(tmp.charAt(k)=='*') continue;
					if(tmp.charAt(k)!=ten_viet_tat[i].charAt(k))
					{
						check = false;
						break;
					}
				}
				if(check==true) v.add(str[i]);
			}
			v.sort(new Comparator<Ten>() {
				@Override
				public int compare(Ten a, Ten b)
				{
					if(a.ten.compareTo(b.ten)<0) return -1;
					if(a.ten.compareTo(b.ten)==0&&a.ho.compareTo(b.ho)<0) return -1;
					return 1;
				}
			});
			for(Ten k:v) System.out.println(k.ho_va_ten);
		}
	}
}
