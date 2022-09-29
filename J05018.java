import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Hoc_Sinh
{
	static int cnt = 1;
	String name,ma_hoc_sinh="HS",xep_loai;
	double p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
	double tong = 0;
	void input(Scanner sc)
	{
		sc.nextLine();
		if(cnt<10) ma_hoc_sinh+="0";
		ma_hoc_sinh+=String.valueOf(cnt++);
		name = sc.nextLine();
		p1 = sc.nextDouble();
		p2 = sc.nextDouble();
		p3 = sc.nextDouble();
		p4 = sc.nextDouble();
		p5 = sc.nextDouble();
		p6 = sc.nextDouble();
		p7 = sc.nextDouble();
		p8 = sc.nextDouble();
		p9 = sc.nextDouble();
		p10 = sc.nextDouble();
		tong += p1*2 + p2*2 + p3 + p4 + p5 + p6 + p7 + p8 + p9 + p10;
		tong/=12;
		if(tong>=9) xep_loai ="XUAT SAC";
		else if(tong>=8) xep_loai ="GIOI";
		else if(tong>=7) xep_loai = "KHA";
		else if(tong>=5) xep_loai = "TB";
		else xep_loai = "YEU";
	}
	public String toString()
	{
		DecimalFormat f = new  DecimalFormat("#.0");
		String s = ma_hoc_sinh + " " + name + " " + f.format(Math.round(tong*10.0)/10.0) + " " + xep_loai;
		return s;
	}
}
public class J05018 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Hoc_Sinh> danh_sach_hoc_sinh = new ArrayList<Hoc_Sinh>();
		while(n-->0)
		{
			Hoc_Sinh hs = new Hoc_Sinh();
			hs.input(sc);
			danh_sach_hoc_sinh.add(hs);
		}
		danh_sach_hoc_sinh.sort(new Comparator<Hoc_Sinh>() {
			@Override
			public int compare(Hoc_Sinh a, Hoc_Sinh b) 
			{
				if(a.tong>b.tong) return -1;
				if(a.tong==b.tong&&a.ma_hoc_sinh.compareTo(b.ma_hoc_sinh)<0) return -1;
				return 1;
			}
		});
		for(Hoc_Sinh tmp : danh_sach_hoc_sinh) System.out.println(tmp);
	}
}
