import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Don_Hang
{
	String ma,ten,xep_loai;
	double lai_xuat;
	void input(Scanner sc)
	{
		ma = sc.nextLine();
		ten = sc.nextLine();
		xep_loai = sc.nextLine();
		if(xep_loai.equals("A")) lai_xuat = 0.08;
		else if(xep_loai.equals("B")) lai_xuat = 0.05;
		else lai_xuat = 0.02;
	}
	void output(double so_luong_nhap,double don_gia_nhap,double so_luong_xuat)
	{
		double tong_nhap = so_luong_nhap*don_gia_nhap;
		double tong_xuat = (so_luong_xuat*don_gia_nhap) +  (so_luong_xuat*don_gia_nhap)*lai_xuat;
		DecimalFormat f = new DecimalFormat("#");
		System.out.println(ma + " " + ten + " " + f.format(tong_nhap)  +" " + f.format(tong_xuat));
	}
}
public class J05076 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Don_Hang> danh_sach_don_hang = new ArrayList<Don_Hang>();
		while(n-->0)
		{
			Don_Hang tmp = new Don_Hang();
			tmp.input(sc);
			danh_sach_don_hang.add(tmp);
		}
		int m = sc.nextInt();
		while(m-->0)
		{
			String ma = sc.next();
			double sln = sc.nextDouble();
			double dg = sc.nextDouble();
			double slx = sc.nextDouble();
			for(int i=0;i<danh_sach_don_hang.size();i++)
			{
				if(danh_sach_don_hang.get(i).ma.equals(ma))
				{
					danh_sach_don_hang.get(i).output(sln, dg, slx);
					break;
				}
			}
		}
	}
}
