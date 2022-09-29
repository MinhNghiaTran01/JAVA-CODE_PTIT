import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Doanh_Nghiep
{
	String ma_doanh_nghiep,ten_doanh_nghiep;
	int so_sinh_vien_co_the_nhan;
	void input(Scanner sc)
	{
		sc.nextLine();
		ma_doanh_nghiep = sc.nextLine();
		ten_doanh_nghiep = sc.nextLine();
		so_sinh_vien_co_the_nhan = sc.nextInt();
	}
	void output()
	{
		System.out.println(ma_doanh_nghiep + " " + ten_doanh_nghiep + " " + so_sinh_vien_co_the_nhan);
	}
}
public class J05028 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Doanh_Nghiep> danh_sach_doanh_nghiep = new ArrayList<Doanh_Nghiep>();
		while(t-->0)
		{
			Doanh_Nghiep DN = new Doanh_Nghiep();
			DN.input(sc);
			danh_sach_doanh_nghiep.add(DN);
		}
		danh_sach_doanh_nghiep.sort(new Comparator<Doanh_Nghiep>() {
			@Override
			public int compare(Doanh_Nghiep a, Doanh_Nghiep b)
			{
				if(a.so_sinh_vien_co_the_nhan>b.so_sinh_vien_co_the_nhan) return -1;
				if(a.so_sinh_vien_co_the_nhan==b.so_sinh_vien_co_the_nhan&&a.ma_doanh_nghiep.compareTo(b.ma_doanh_nghiep)<0) return -1;
				return 1;
			}
		});
		for(Doanh_Nghiep tmp:danh_sach_doanh_nghiep) tmp.output();
	}
}
