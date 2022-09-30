import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Sinh_Vien
{
	static int cnt = 1;
	String ma_sinh_vien,ho_ten,lop,email,doanh_nghiep;
	int thu_tu;
	void input(Scanner sc)
	{
		thu_tu = cnt++;
		ma_sinh_vien = sc.nextLine();
		ho_ten = sc.nextLine();
		lop = sc.nextLine();
		email = sc.nextLine();
		doanh_nghiep = sc.nextLine();
				
	}
	void output()
	{
		System.out.println(thu_tu+ " " + ma_sinh_vien + " " + ho_ten + " " + lop + " " + email + " " + doanh_nghiep);
	}
}
public class J05035{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		List<Sinh_Vien> danh_sach_sinh_vien = new ArrayList<Sinh_Vien>();
		while(t-->0)
		{
			Sinh_Vien sv = new Sinh_Vien();
			sv.input(sc);
			danh_sach_sinh_vien.add(sv);
		}
		danh_sach_sinh_vien.sort(new Comparator<Sinh_Vien>() {
			@Override
			public int compare(Sinh_Vien a, Sinh_Vien b)
			{
				if(a.ma_sinh_vien.compareTo(b.ma_sinh_vien)<0) return -1;
				return 1;
			}
		});
		int q = sc.nextInt();
		sc.nextLine();
		while(q-->0)
		{
			String cong_ty = sc.nextLine();
			for(Sinh_Vien tmp:danh_sach_sinh_vien)
			{
				if(tmp.doanh_nghiep.equals(cong_ty)) tmp.output();
			}
		}
	}
}
