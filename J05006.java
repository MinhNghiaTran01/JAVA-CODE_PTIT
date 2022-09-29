import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
class Nhan_Vien
{
	static int cnt = 1;
	String ma_nhan_vien,ho_ten,gioi_tinh,ngay_sinh,dia_chi,ma_so_thue,ngay_ki_hop_dong;
	long time;
	void input(Scanner sc) throws ParseException
	{
		ma_nhan_vien = String.valueOf(cnt++);
		while(ma_nhan_vien.length()<5) ma_nhan_vien = "0" + ma_nhan_vien;
		ho_ten = sc.nextLine();
		gioi_tinh = sc.nextLine();
		ngay_sinh = sc.nextLine();
		dia_chi = sc.nextLine();
		ma_so_thue = sc.nextLine();
		ngay_ki_hop_dong = sc.nextLine();
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_sinh);
		time = d.getTime();
	}
	public String toString()
	{
		String s = ma_nhan_vien + " " + ho_ten + " " + gioi_tinh + " " + ngay_sinh + " " + dia_chi + " " + ma_so_thue + " " + ngay_ki_hop_dong;
		return s;
	}
}
public class J05006 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Nhan_Vien> list_nhan_vien = new ArrayList<Nhan_Vien>();
		sc.nextLine();
		while(t-->0)
		{
			Nhan_Vien nv = new Nhan_Vien();
			nv.input(sc);
			list_nhan_vien.add(nv);
		}
		list_nhan_vien.sort(new Comparator<Nhan_Vien>() {
			@Override
			public int compare(Nhan_Vien a,Nhan_Vien b)
			{
				if(a.time<b.time) return -1;
				return 1;
			}
		});
		for(Nhan_Vien tmp: list_nhan_vien) System.out.println(tmp);
	}
}
