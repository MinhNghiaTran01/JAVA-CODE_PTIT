import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Xet_tuyen
{
	static int cnt = 1;
	String name,ngay_sinh,ma_thi_tuyen="PH";
	double diem_ly_thuyet,diem_thuc_hanh;
	int tuoi;
	void input(Scanner sc) throws ParseException
	{
		if(cnt<10) ma_thi_tuyen+="0";
		ma_thi_tuyen+=String.valueOf(cnt++);
		sc.nextLine();
		name = sc.nextLine();
		ngay_sinh = sc.next();
		diem_ly_thuyet = sc.nextDouble();
		diem_thuc_hanh = sc.nextDouble();
		Date d = new SimpleDateFormat("dd/MM/yyyy").parse(ngay_sinh);
		String ngay_sinh_chuan_hoa = new SimpleDateFormat("dd/MM/yyyy").format(d);
		String nam_sinh = ngay_sinh_chuan_hoa.substring(6);
		tuoi = 2021 - Integer.valueOf(nam_sinh);
	}
	void chuan_hoa_ho_ten()
	{
		String tmp = this.name;
		tmp = tmp.trim();
		String s = "";
		for(int i=0;i<tmp.length();i++)
		{
			if(i==0||tmp.charAt(i-1)==' '&&tmp.charAt(i)!=' ')
			{
				s+=" ";
				s+=Character.toUpperCase(tmp.charAt(i));
			}
			else if (tmp.charAt(i)!=' ')
			{
				s+=Character.toLowerCase(tmp.charAt(i));
			}
		}
		s = s.trim();
		this.name = s;
	}
	public String toString()
	{
		chuan_hoa_ho_ten();
		DecimalFormat f = new DecimalFormat("##");
		double diem_trung_binh = (this.diem_ly_thuyet+this.diem_thuc_hanh)/2;
		if(diem_ly_thuyet>=8&&diem_thuc_hanh>=8) diem_trung_binh+=1;
		else if(diem_ly_thuyet>=7.5&&diem_thuc_hanh>=7.5) diem_trung_binh+=0.5;
		diem_trung_binh = Math.round(diem_trung_binh);
		if(diem_trung_binh>10) diem_trung_binh = 10;
		String xep_loai = "";
		if(diem_trung_binh<5) xep_loai = "Truot";
		else if(diem_trung_binh<=6) xep_loai = "Trung binh";
		else if(diem_trung_binh<8) xep_loai = "Kha";
		else if(diem_trung_binh<9) xep_loai = "Gioi";
		else xep_loai = "Xuat sac";
		
		String s = this.ma_thi_tuyen + " " +  this.name + " " + this.tuoi + " " + f.format(diem_trung_binh) + " " + xep_loai;
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException, ParseException {
		Scanner sc = new Scanner(new File("XETTUYEN.in"));
		int n = sc.nextInt();
		List<Xet_tuyen> list = new ArrayList<Xet_tuyen>();
		while(n-->0)
		{
			Xet_tuyen xt = new Xet_tuyen();
			xt.input(sc);
			list.add(xt);
		}
		for(Xet_tuyen tmp :list ) System.out.println(tmp);
	}
}
