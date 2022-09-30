import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Nhan_Vien1
{
	static int cnt = 1;
	String ho_ten,chuc_vu,ma_nhan_vien="NV";
	double tam_ung;
	int luong_ngay,so_ngay_cong,luong_thang=0,luong_thuong=0,phu_cap=0,thuc_linh=0;
	void input(Scanner sc)
	{
		if(cnt<10) ma_nhan_vien+="0";
		ma_nhan_vien+=String.valueOf(cnt++);
		sc.nextLine();
		ho_ten = sc.nextLine();
		chuc_vu = sc.next();
		luong_ngay = sc.nextInt();
		so_ngay_cong = sc.nextInt();
		luong_thang = luong_ngay*so_ngay_cong;
		
		if(chuc_vu.equals("GD")) phu_cap+=500;
		else if(chuc_vu.equals("PGD")) phu_cap += 400;
		else if(chuc_vu.equals("TP")) phu_cap+=300;
		else if(chuc_vu.equals("KT")) phu_cap+=250;
		else phu_cap+=100;
		luong_thang = luong_ngay*so_ngay_cong;
		tam_ung = (double) ((phu_cap+luong_thang)*(2.0/3.0));
		if(tam_ung<25000)
		{
			tam_ung = Math.round(tam_ung/1000.0)*1000.0;
		}
		else tam_ung = 25000;
	}
	void output()
	{
		DecimalFormat f = new DecimalFormat("#");
		System.out.println(ma_nhan_vien +" " + ho_ten + " " + phu_cap + " " + luong_thang + " "+ f.format(tam_ung) + " " + f.format(luong_thang-tam_ung+phu_cap));
	}
}
public class J05044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Nhan_Vien1> danh_sach_nhan_vien = new ArrayList<Nhan_Vien1>();
		while(n-->0)
		{
			Nhan_Vien1 nv = new Nhan_Vien1();
			nv.input(sc);
			danh_sach_nhan_vien.add(nv);
		}
		String chuc_vu = sc.next();
		for(Nhan_Vien1 tmp: danh_sach_nhan_vien)
		{
			if(tmp.chuc_vu.equals(chuc_vu))
			{
				tmp.output();
			}
		}
	}
}
