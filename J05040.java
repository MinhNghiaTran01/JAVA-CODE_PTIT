import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Nhan_Vien
{
	static int cnt = 1;
	static int tong_chi_phi_tien_luong = 0;
	String ho_ten,chuc_vu,ma_nhan_vien="NV";
	int luong_ngay,so_ngay_cong,luong_thang=0,luong_thuong=0,phu_cap=0,thuc_linh=0;
	void input(Scanner sc)
	{
		if(cnt<10) ma_nhan_vien+="0";
		ma_nhan_vien+=String.valueOf(cnt++);
		sc.nextLine();
		ho_ten = sc.nextLine();
		luong_ngay = sc.nextInt();
		so_ngay_cong = sc.nextInt();
		chuc_vu = sc.next();
		luong_thang = luong_ngay*so_ngay_cong;
		if(so_ngay_cong>=25) luong_thuong = (int) (0.2*luong_thang);
		else if(so_ngay_cong>=22) luong_thuong = (int) (0.1*luong_thang);
		
		if(chuc_vu.equals("GD")) phu_cap+=250000;
		else if(chuc_vu.equals("PGD")) phu_cap += 200000;
		else if(chuc_vu.equals("TP")) phu_cap+=180000;
		else phu_cap+=150000;
		thuc_linh = luong_thang + luong_thuong + phu_cap;
		tong_chi_phi_tien_luong += thuc_linh;
	}
	void output()
	{
		System.out.println(ma_nhan_vien +" " + ho_ten + " " +luong_thang + " " + luong_thuong + " "+ phu_cap + " " + thuc_linh);
	}
}
public class J05040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Nhan_Vien> danh_sach_nhan_vien = new ArrayList<Nhan_Vien>();
		while(n-->0)
		{
			Nhan_Vien nv = new Nhan_Vien();
			nv.input(sc);
			danh_sach_nhan_vien.add(nv);
		}
		for(Nhan_Vien tmp: danh_sach_nhan_vien) tmp.output();
	}
}
