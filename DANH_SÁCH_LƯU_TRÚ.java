package DANH_SACH_LUU_TRU;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class KHACH_HANG {
	String ma_khach_hang,name,ma_phong,ngay_den,ngay_di;
	public KHACH_HANG(String ma_khach_hang, String name, String ma_phong, String ngay_den, String ngay_di) {
		this.ma_khach_hang = ma_khach_hang;
		this.name = name;
		this.ma_phong = ma_phong;
		this.ngay_den = ngay_den;
		this.ngay_di = ngay_di;
	}
	public long NGAY_LUU_TRU() throws ParseException
	{
		Date ngayden = new SimpleDateFormat("dd/MM/yyyy").parse(this.ngay_den);
		Date ngaydi = new SimpleDateFormat("dd/MM/yyyy").parse(this.ngay_di);
		long luu_tru = ngaydi.getTime() - ngayden.getTime();
		long ngay = TimeUnit.MILLISECONDS.toDays(luu_tru);
		return ngay;
	}
	public String toString()
	{
		String s="";
		try {
			s = this.ma_khach_hang + " " + this.name + " " + this.ma_phong + " " + this.NGAY_LUU_TRU();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("KHACH.in"));
		List<KHACH_HANG> list = new ArrayList<KHACH_HANG>();
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sc.nextLine();
			String ma_khach_hang = "KH";
			if(i<10) ma_khach_hang +="0";
			ma_khach_hang+=String.valueOf(i);
			String name = sc.nextLine();
			String ma_phong = sc.next();
			String ngay_den = sc.next();
			String ngay_di = sc.next();
			KHACH_HANG kh = new KHACH_HANG(ma_khach_hang, name, ma_phong, ngay_den, ngay_di);
			list.add(kh);
		}
		list.sort(new Comparator<KHACH_HANG>() {
			@Override
			public int compare(KHACH_HANG a, KHACH_HANG b)
			{
				try {
					if(a.NGAY_LUU_TRU()>b.NGAY_LUU_TRU()) return -1;
				} catch (ParseException e) {
					e.printStackTrace();
				}
				return 1;
			}
		});
		for(KHACH_HANG tmp : list) System.out.println(tmp);
	}
}
