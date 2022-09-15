import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Xep_loai
{
	static int cnt = 1;
	String name,ngay_sinh,ma_thi_tuyen="SV";
	double diem_luyen_tap,diem_thuc_hanh,diem_thi,diem_trung_binh;
	void input(Scanner sc) throws ParseException
	{
		if(cnt<10) ma_thi_tuyen+="0";
		ma_thi_tuyen+=String.valueOf(cnt++);
		sc.nextLine();
		name = sc.nextLine();
		diem_luyen_tap = sc.nextDouble();
		diem_thuc_hanh = sc.nextDouble();
		diem_thi = sc.nextDouble();
		diem_trung_binh = diem_luyen_tap*0.25+diem_thuc_hanh*0.35+diem_thi*0.40;
	}
	void chuan_hoa_ho_ten()
	{
		String tmp = this.name;
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
				s+=Character.toLowerCase(tmp.charAt(i));
			}
		}
		s = s.trim();
		this.name = s;
	}
	public String toString()
	{
		chuan_hoa_ho_ten();
		DecimalFormat f = new DecimalFormat("##.00");
		String xep_loai = "";
		if(diem_trung_binh<5) xep_loai = "KEM";
		else if(diem_trung_binh<6.5) xep_loai = "TRUNG BINH";
		else if(diem_trung_binh<8) xep_loai = "KHA";
		else xep_loai = "GIOI";
		
		String s = this.ma_thi_tuyen + " " +  this.name + " " + f.format(diem_trung_binh) + " " + xep_loai;
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("BANGDIEM.in"));
		int n = sc.nextInt();
		List<Xep_loai> list = new ArrayList<Xep_loai>();
		while(n-->0)
		{
			Xep_loai xl = new Xep_loai();
			xl.input(sc);
			list.add(xl);
		}
		list.sort(new Comparator<Xep_loai>() {
			@Override
			public int compare(Xep_loai a, Xep_loai b)
			{
				if(a.diem_trung_binh>b.diem_trung_binh) return -1;
				return 1;
			}
		});
		for(Xep_loai tmp :list ) System.out.println(tmp);
	}
}
