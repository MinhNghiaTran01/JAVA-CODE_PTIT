import java.util.Scanner;
public class J04012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ho_ten = sc.nextLine();
		long luong_co_ban = sc.nextInt();
		long so_ngay_cong = sc.nextInt();
		long phu_cap = 0;
		long thuong = 0;
		String chuc_vu = sc.next();
		if(so_ngay_cong>=25) thuong=(long) (0.2*luong_co_ban*so_ngay_cong);
		else if(so_ngay_cong>=22&&so_ngay_cong<25) thuong=(long) (0.1*luong_co_ban*so_ngay_cong);
		if(chuc_vu.equals("GD")) phu_cap+=250000 ;
		else if(chuc_vu.equals("PGD")) phu_cap+=200000;
		else if(chuc_vu.equals("TP")) phu_cap+=180000;
		else if(chuc_vu.equals("NV")) phu_cap+=150000;
		System.out.println("NV01 " + ho_ten + " " + luong_co_ban*so_ngay_cong + " "+ thuong +" " + phu_cap + " " + (luong_co_ban*so_ngay_cong+phu_cap+thuong) );
	}
}
