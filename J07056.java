import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Khach_hang
{
	String name,loai_ho_gia_dinh,ma_khach_hang="KH";
	long chi_so_dau,chi_so_cuoi,tien_trong_dinh_muc,tien_vuot_dinh_muc,thue_VAT,tong_tien;
	void input(Scanner sc,int cnt)
	{
		name = sc.nextLine();
		String tmp = sc.nextLine();
		String s[] = tmp.split(" ");
		loai_ho_gia_dinh = s[0];
		chi_so_dau = Long.valueOf(s[1]);
		chi_so_cuoi = Long.valueOf(s[2]);
		if(cnt<10) ma_khach_hang+="0";
		ma_khach_hang+=String.valueOf(cnt);
		long so_dien = chi_so_cuoi - chi_so_dau;
		long dinh_muc = 0;
		if(loai_ho_gia_dinh.equals("A")) dinh_muc=100;
		if(loai_ho_gia_dinh.equals("B")) dinh_muc=500;
		if(loai_ho_gia_dinh.equals("C")) dinh_muc=200;
		if(so_dien<=dinh_muc) tien_trong_dinh_muc = so_dien*450;
		else tien_trong_dinh_muc = dinh_muc*1000;
		if(so_dien>dinh_muc)
		{
			tien_vuot_dinh_muc = (so_dien-dinh_muc)*1000;
		}
		else
		{
			tien_vuot_dinh_muc = 0;
		}
		thue_VAT =(long) (0.05*tien_vuot_dinh_muc);
		tong_tien = tien_trong_dinh_muc + tien_vuot_dinh_muc + thue_VAT;
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
		String s = this.ma_khach_hang +  " " + this.name + " " + this.tien_trong_dinh_muc + " " + this.tien_vuot_dinh_muc +  " " + thue_VAT + " " + this.tong_tien;
		return s;
	}
}
public class J07056 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		int n = sc.nextInt();
		sc.nextLine();
		List<Khach_hang> list= new ArrayList<Khach_hang>();
		for(int i=1;i<=n;i++)
		{
			Khach_hang k = new Khach_hang();
			k.input(sc,i);
			list.add(k);
		}
		list.sort(new Comparator<Khach_hang>() {
			@Override
			public int compare(Khach_hang a, Khach_hang b)
			{
				if(a.tong_tien>b.tong_tien) return -1;
				return 1;
			}
		});
		for(Khach_hang tmp:list) System.out.println(tmp);
	}
}
