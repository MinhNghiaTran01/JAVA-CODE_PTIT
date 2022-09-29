import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Giang_Vien
{
	static int cnt = 1;
	String ho_va_ten,bo_mon,ma_giang_vien="GV";
	String ten,ma_bo_mon="";
	void input(Scanner sc)
	{
		if(cnt<10) ma_giang_vien+="0";
		ma_giang_vien+=String.valueOf(cnt++);
		ho_va_ten = sc.nextLine();
		bo_mon = sc.nextLine().toUpperCase();
		String tmp[] = ho_va_ten.split("\\s+");
		String s[] = bo_mon.split("\\s+");
		ten = tmp[tmp.length-1];
		for(int i=0;i<s.length;i++) ma_bo_mon+=s[i].charAt(0);
	}
	public String toString()
	{
		String s = ma_giang_vien + " " + ho_va_ten + " " + ma_bo_mon;
		return s;
	}
}
public class J05027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		List<Giang_Vien> danh_sach_giang_vien = new ArrayList<Giang_Vien>();
		while(t-->0)
		{
			Giang_Vien gv = new Giang_Vien();
			gv.input(sc);
			danh_sach_giang_vien.add(gv);
		}
		
		int n = sc.nextInt();
		sc.nextLine();
		while(n-->0)
		{
			String Key = sc.nextLine();
			System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + Key + ":");
			String s[] = Key.split("\\s+");
			for(Giang_Vien TMP: danh_sach_giang_vien)
			{
				for(String word:s)
				{
					word = word.toLowerCase();
					String ho_ten = TMP.ho_va_ten.toLowerCase();
					if(ho_ten.contains(word))
					{
						System.out.println(TMP);
						break;
					}
				}
			}
		}
	}
}
