import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Mat_Hang
{
	static int cnt =1;
	String ten_hang,don_vi_tinh;
	double don_gia_nhap,so_luong;
	double phi_van_chuyen,thanh_tien,gia_ban;
	String ma_mat_hang = "MH";
	void input(Scanner sc)
	{
		sc.nextLine();
		if(cnt<10) ma_mat_hang+="0";
		ma_mat_hang+=String.valueOf(cnt++);
		ten_hang = sc.nextLine();
		don_vi_tinh = sc.nextLine();
		don_gia_nhap = sc.nextDouble();
		so_luong = sc.nextDouble();
		phi_van_chuyen = (don_gia_nhap*so_luong)*0.05;
		phi_van_chuyen = Math.round(phi_van_chuyen);
		thanh_tien = don_gia_nhap*so_luong + phi_van_chuyen;
		thanh_tien = Math.round(thanh_tien);
		gia_ban = (thanh_tien + 0.02*thanh_tien)/so_luong;
		gia_ban = Math.ceil(gia_ban/100.0)*100.0;
	}
	void output()
	{
		DecimalFormat f = new DecimalFormat("#");
		System.out.println(ma_mat_hang + " " + ten_hang + " " + don_vi_tinh + " " + f.format(phi_van_chuyen) + " " + f.format(thanh_tien) + " " + f.format(gia_ban));
	}
}
public class J05036 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Mat_Hang> danh_sach_mat_hang = new ArrayList<Mat_Hang>();
		while(n-->0)
		{
			Mat_Hang m = new Mat_Hang();
			m.input(sc);
			danh_sach_mat_hang.add(m);
		}
		danh_sach_mat_hang.sort(new Comparator<Mat_Hang>() {
			@Override
			public int compare(Mat_Hang a, Mat_Hang b)
			{
				if(a.gia_ban>b.gia_ban) return -1;
				return 1;
			}
		});
		for(Mat_Hang tmp: danh_sach_mat_hang) tmp.output();
	}
}	
