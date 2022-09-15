import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
class Khach_Hang
{
	static int cnt = 1;
	static int a[] = {25,34,50,80};
	String name,so_phong,ngay_nhan,ngay_tra,ma_khach_hang="KH";
	long tien_dich_vu;
	void input(Scanner sc)
	{
		sc.nextLine();
		if(cnt<10) ma_khach_hang+="0";
		ma_khach_hang += String.valueOf(cnt++);
		name = sc.nextLine();
		so_phong = sc.next();
		ngay_nhan = sc.next();
		ngay_tra = sc.next();
		tien_dich_vu = sc.nextLong();
	}
	long ngay_o() throws ParseException
	{
		Date ngay_nhan = new SimpleDateFormat("dd/MM/yyyy").parse(this.ngay_nhan);
		Date ngay_tra = new SimpleDateFormat("dd/MM/yyyy").parse(this.ngay_tra);
		long ngay = ngay_tra.getTime() - ngay_nhan.getTime();
		return TimeUnit.MILLISECONDS.toDays(ngay) + 1;
	}
	public long thanh_tien() throws ParseException
	{
		int tang = so_phong.charAt(0) - '0' - 1;
		return tien_dich_vu + ngay_o()*a[tang];
	}
	public void chuan_hoa_ten()
	{
		String s = "";
		this.name = this.name.trim();
		for(int i=0;i<this.name.length();i++)
		{
			if(i==0||this.name.charAt(i-1)==' '&&this.name.charAt(i)!=' ')
			{
				s+=" ";
				s+=Character.toUpperCase(this.name.charAt(i));
			}
			else if(this.name.charAt(i)!=' ')
			{
				s+=Character.toLowerCase(this.name.charAt(i));
			}
		}
		this.name = s.trim();
	}
	public String toString()
	{
		chuan_hoa_ten();
		String s="";
		try {
			s = this.ma_khach_hang + " " + this.name + " " + this.so_phong + " " + this.ngay_o() + " " + this.thanh_tien();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACHHANG.in"));
		List<Khach_Hang> list = new ArrayList<Khach_Hang>();
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			Khach_Hang kh = new Khach_Hang();
			kh.input(sc);
			list.add(kh);
		}
		list.sort(new Comparator<Khach_Hang>() {
			@Override
			public int compare(Khach_Hang a, Khach_Hang b)
			{
				try {
					if(a.thanh_tien()>b.thanh_tien()) return -1;
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return 1;
			}
		});
		for(Khach_Hang tmp: list) System.out.println(tmp);
	}
}
