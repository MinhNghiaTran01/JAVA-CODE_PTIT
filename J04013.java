import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class J04013 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ma_thi_sinh = sc.next();
		sc.nextLine();
		String ho_va_ten = sc.nextLine();
		double diem_toan = sc.nextDouble()*2;
		double diem_ly = sc.nextDouble();
		double diem_hoa = sc.nextDouble();
		double tong_diem = diem_hoa + diem_ly + diem_toan;
		double uu_tien = 0;
		if(ma_thi_sinh.substring(0,3).equals("KV1")) uu_tien+=0.5;
		else if(ma_thi_sinh.substring(0,3).equals("KV2")) uu_tien+=1;
		else if(ma_thi_sinh.substring(0,3).equals("KV3")) uu_tien+=2.5;
		double tmp_uu_tien = uu_tien*10;
		double tmp_tong_diem = tong_diem*10;
		DecimalFormat f = new DecimalFormat("#");
		
		System.out.print(ma_thi_sinh + " " + ho_va_ten + " ");
		
		if(tmp_uu_tien%10==(double)0)  System.out.print(f.format(uu_tien));
		else System.out.print(uu_tien);
		
		System.out.print(" ");
		
		if(tmp_tong_diem%10==(double)0) System.out.print(f.format(tong_diem));
		else System.out.print(tong_diem);
		
		String trang_thai = "";
		if(tong_diem+uu_tien>=24) trang_thai = "TRUNG TUYEN";
		else trang_thai =  "TRUOT";
		System.out.println(" "+ trang_thai);
		
	}
}
