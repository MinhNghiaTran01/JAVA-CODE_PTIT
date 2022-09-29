import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Thi_sinh
{
	String name,dan_toc,khu_vuc,ma_thi_sinh="TS";
	double diem_thi,tong_diem=0;
	void input(Scanner sc,int cnt)
	{
		if(cnt<10) ma_thi_sinh+="0";
		ma_thi_sinh+=String.valueOf(cnt);
		name = sc.nextLine();
		diem_thi = sc.nextDouble();
		sc.nextLine();
		dan_toc = sc.nextLine();
		khu_vuc = sc.nextLine();
		if(dan_toc.equals("Kinh")==false) tong_diem+=1.5;
		if(khu_vuc.equals("1")) tong_diem+=1.5;
		if(khu_vuc.equals("2")) tong_diem+=1;
		tong_diem+=diem_thi;
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
		DecimalFormat f = new DecimalFormat(".0");
		chuan_hoa_ho_ten();
		String trang_thai = "";
		if(tong_diem>=20.5) trang_thai = "Do";
		else trang_thai = "Truot";
		String s = this.ma_thi_sinh + " " + this.name + " " + f.format(this.tong_diem) + " " + trang_thai;
		return s;
	}
}
public class J07057 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("THISINH.in"));
		int n = sc.nextInt();
		sc.nextLine();
		List<Thi_sinh> list = new ArrayList<Thi_sinh>();
		for(int i=1;i<=n;i++)
		{
			Thi_sinh ts = new Thi_sinh();
			ts.input(sc,i);
			list.add(ts);
		}
		list.sort(new Comparator<Thi_sinh>() {
			@Override
			public int compare(Thi_sinh a, Thi_sinh b)
			{
				if(a.tong_diem>b.tong_diem) return -1;
				if(a.tong_diem==b.tong_diem&&a.ma_thi_sinh.compareTo(b.ma_thi_sinh)<0) return -1;
				return 1;
			}
		});
		for(Thi_sinh tmp:list) System.out.println(tmp);
	}
}
