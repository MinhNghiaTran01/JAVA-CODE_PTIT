import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Sinh_Vien
{
	String ho_ten;
	int c,t;
	void input(Scanner sc)
	{
		sc.nextLine();
		ho_ten = sc.nextLine();
		c = sc.nextInt();
		t = sc.nextInt();
	}
	void output()
	{
		System.out.println(ho_ten + " " + c + " " + t);
	}
}
public class J05042 {
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
			public int compare(Sinh_Vien a,Sinh_Vien b)
			{
				if(a.c>b.c) return -1;
				if(a.c==b.c&&a.t<b.t) return -1;
				if(a.c==b.c&&a.t==b.t&&a.ho_ten.compareTo(b.ho_ten)<0) return -1;
				return 1;
			}
		});
		for(Sinh_Vien tmp: danh_sach_sinh_vien) tmp.output();
	}
}
