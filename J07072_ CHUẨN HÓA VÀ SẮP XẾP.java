import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Ten
{
	String ho,ten,ten_dem,name;

	public Ten(String ho, String ten_dem, String ten,String name) {
		this.ho = ho;
		this.ten = ten;
		this.ten_dem = ten_dem;
		this.name = name;
	}
	public String toString()
	{
		return this.name;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("DANHSACH.in"));
		List<Ten> list = new ArrayList<Ten>();
		while(sc.hasNextLine())
		{
			String name = sc.nextLine();
			name = name.trim().toLowerCase();
			String tmp="";
			for(int i=0;i<name.length();i++)
			{
				if(i==0||name.charAt(i-1)==' '&&name.charAt(i)!=' ')
				{
					tmp+=" ";
					tmp+=Character.toUpperCase(name.charAt(i));
				}
				else if(name.charAt(i)!=' ')
				{
					tmp+=name.charAt(i);
				}
			}
			tmp = tmp.trim();
			name = tmp;
			String s[] = name.split("\\s+");
			String ho = s[0];
			String ten = s[s.length-1];
			String ten_dem = "";
			for(int i=1;i<s.length-1;i++)
			{
				ten_dem+=s[i] + " ";
			}
			Ten t = new Ten(ho,ten_dem,ten,name);
			list.add(t);
		}
		list.sort(new Comparator<Ten>() {
			@Override
			public int compare(Ten a, Ten b)
			{
				if(a.ten.equals(b.ten)==false&&a.ten.compareTo(b.ten)<0) return -1;
				if(a.ten.equals(b.ten)&&a.ho.compareTo(b.ho)<0) return -1;
				if(a.ten.equals(b.ten)&&a.ho.compareTo(b.ho)==0&&a.ten_dem.compareTo(b.ten_dem)<0) return -1;
				return 1;
			}
		});
		for(Ten tmp:list) System.out.println(tmp);
	}
}
