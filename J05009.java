import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Thi_sinh
{
	static int cnt = 1;
	String ho_ten,ngay_sinh,ma_thi_sinh;
	double p1,p2,p3,tong_diem;
	void input(Scanner sc)
	{
		ma_thi_sinh = String.valueOf(cnt++);
		sc.nextLine();
		ho_ten = sc.nextLine();
		ngay_sinh = sc.next();
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		p3 = sc.nextDouble();
		tong_diem= p1+p2+p3;
	}
	public String toString()
	{
		String s = ma_thi_sinh + " " + ho_ten + " " + ngay_sinh + " " + tong_diem;
		return s;
	}
}
public class J05009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Thi_sinh> danh_sach_thi_sinh = new ArrayList<Thi_sinh>();
		while(t-->0)
		{
			Thi_sinh ts = new Thi_sinh();
			ts.input(sc);
			danh_sach_thi_sinh.add(ts);
		}
		danh_sach_thi_sinh.sort(new Comparator<Thi_sinh>() {
			@Override
			public int compare(Thi_sinh a,Thi_sinh b)
			{
				if(a.tong_diem>b.tong_diem) return -1;
				if(a.tong_diem==b.tong_diem&&a.ma_thi_sinh.compareTo(b.ma_thi_sinh)<0) return -1;
				return 1;
			}
		});
		double tong_diem = danh_sach_thi_sinh.get(0).tong_diem;
		for(Thi_sinh tmp:danh_sach_thi_sinh)
		{
			if(tmp.tong_diem!=tong_diem) break;
			else System.out.println(tmp);
		}
	}
}
