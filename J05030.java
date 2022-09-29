import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Sinh_Vien
{
	static int cnt = 1;
	String ma_sinh_vien,ho_va_ten,lop;
	double p1,p2,p3;
	void input(Scanner sc)
	{
		sc.nextLine();
		ma_sinh_vien = sc.nextLine();
		ho_va_ten = sc.nextLine();
		lop = sc.nextLine();
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		p3 = sc.nextDouble();
	}
	void output()
	{
		System.out.print(cnt++ + " ");
		System.out.println( ma_sinh_vien + " " + ho_va_ten + " " + lop + " " + p1 + " " + p2 + " " + p3);
	}
}
public class J05030 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
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
		for(Sinh_Vien tmp: danh_sach_sinh_vien) tmp.output();
	}
}
