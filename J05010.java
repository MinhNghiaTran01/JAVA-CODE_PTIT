import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Mat_hang
{
	static int cnt = 1;
	String ten_mat_hang,nhom_hang,ma_mat_hang;
	double gia_mua,gia_ban,loi_nhuan;
	void input(Scanner sc)
	{
		sc.nextLine();
		ma_mat_hang = String.valueOf(cnt++);
		ten_mat_hang = sc.nextLine();
		nhom_hang = sc.nextLine();
		gia_mua = sc.nextDouble();
		gia_ban = sc.nextDouble();
		loi_nhuan = gia_ban - gia_mua;
	}
	public String toString()
	{
		DecimalFormat f = new DecimalFormat("#.00");
		String s = ma_mat_hang + " " + ten_mat_hang + " " + nhom_hang + " " + f.format(loi_nhuan);
		return s;
	}
}
public class J05010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Mat_hang> danh_sach_mat_hang = new ArrayList<Mat_hang>();
		while(n-->0)
		{
			Mat_hang m = new Mat_hang();
			m.input(sc);
			danh_sach_mat_hang.add(m);
		}
		danh_sach_mat_hang.sort(new Comparator<Mat_hang>() {
			@Override
			public int compare(Mat_hang a, Mat_hang b)
			{
				if(a.loi_nhuan>b.loi_nhuan) return -1;
				return 1;
			}
		});
		for(Mat_hang tmp : danh_sach_mat_hang) System.out.println(tmp);
	}
}
