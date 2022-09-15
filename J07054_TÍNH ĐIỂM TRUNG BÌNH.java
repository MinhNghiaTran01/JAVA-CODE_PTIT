import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Sinh_vien
{
	static int cnt = 1;
	String ma_sinh_vien="SV",name;
	double p1,p2,p3;
	String diem_trung_binh;
	void input(Scanner sc)
	{
		sc.nextLine();
		if(cnt<10) ma_sinh_vien+="0";
		ma_sinh_vien+=String.valueOf(cnt++);
		name = sc.nextLine();
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		p3 = sc.nextDouble();
		DecimalFormat f = new DecimalFormat("##.00");
		double tmp = (p1*3+p2*3+p3*2)/8;
		tmp = Math.ceil(tmp*100)/100;
		diem_trung_binh = f.format(tmp);
	}
	void chuan_hoa_ho_ten()
	{
		String tmp = this.name.toLowerCase();
		tmp = tmp.trim();
		String s = "";
		for(int i=0;i<tmp.length();i++)
		{
			if(i==0||tmp.charAt(i-1)==' '&&tmp.charAt(i)!=' ')
			{
				s+=" ";
				s+=Character.toUpperCase(tmp.charAt(i));
			}
			else if (tmp.charAt(i)!=' ')
			{
				s+=tmp.charAt(i);
			}
		}
		s = s.trim();
		this.name = s;
	}
	public String toString()
	{
		chuan_hoa_ho_ten();
		String s = this.ma_sinh_vien + " " + this.name + " " + this.diem_trung_binh;
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = sc.nextInt();
		List<Sinh_vien> list  = new ArrayList<Sinh_vien>();
		while(n-->0)
		{
			Sinh_vien sv = new Sinh_vien();
			sv.input(sc);
			list.add(sv);
		}
		list.sort(new Comparator<Sinh_vien>() {
			@Override
			public int compare(Sinh_vien a, Sinh_vien b)
			{
				if(a.diem_trung_binh.length()>b.diem_trung_binh.length()) return -1;
				else if(a.diem_trung_binh.length()==b.diem_trung_binh.length()&&a.diem_trung_binh.compareTo(b.diem_trung_binh)>0) return -1;
				else if(a.diem_trung_binh.equals(b.diem_trung_binh)&&a.ma_sinh_vien.compareTo(b.ma_sinh_vien)<0) return -1;
				return 1;
			}
		});
		int cnt = 0;
		int xep_loai = 1;
		for(int i=0;i<list.size();i++)
		{
			cnt+=1;
			if(i==0) System.out.println(list.get(i) + " " + xep_loai);
			else 
			{
				if(list.get(i).diem_trung_binh.equals(list.get(i-1).diem_trung_binh)) System.out.println(list.get(i) + " " + xep_loai);
				else 
				{
					xep_loai = cnt;
					System.out.println(list.get(i) + " " + xep_loai);
				}
			}
		}
	}
}	
