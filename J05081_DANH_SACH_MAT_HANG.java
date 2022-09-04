import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Mathang
{
	String ma_mat_hang,name,don_vi_tinh;
	int giamua,giaban;
	public Mathang(String ma_mat_hang,String name, String don_vi_tinh, int giamua, int giaban) {
		this.ma_mat_hang = ma_mat_hang;
		this.name = name;
		this.don_vi_tinh = don_vi_tinh;
		this.giamua = giamua;
		this.giaban = giaban;
	}
}
public class TMN {
	public static void main(String[] args) {
		List<Mathang> list = new ArrayList<Mathang>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			sc.nextLine();
			String tmp = String.valueOf(i);
			while(tmp.length()<3)
			{
				tmp="0" + tmp;
			}
			String ma_mat_hang = "MH" + tmp;
			String name = sc.nextLine();
			String don_vi_tinh = sc.next();
			int mua = sc.nextInt();
			int ban = sc.nextInt();
			list.add(new Mathang(ma_mat_hang,name,don_vi_tinh,mua,ban));
		}
		Collections.sort(list,new Comparator<Mathang>() {
			@Override
			public int compare(Mathang a,Mathang b)
			{
				if((a.giaban-a.giamua)<(b.giaban-b.giamua)) return 1;
				else if((a.giaban-a.giamua)==(b.giaban-b.giamua)&&a.ma_mat_hang.compareTo(b.ma_mat_hang)>0) return 1;
				return -1;
			}
		});
		for(Mathang mh:list) System.out.println(mh.ma_mat_hang + " " + mh.name+ " " + mh.don_vi_tinh + " " + mh.giamua +" "+  mh.giaban + " " + (mh.giaban-mh.giamua));
	}
}
