import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class GAME_THU
{
	String ma_nguoi_choi,ten_nguoi_choi,gio_vao,gio_ra;
	long time,gio,phut;
	void input(Scanner sc) throws ParseException
	{
		ma_nguoi_choi = sc.nextLine();
		ten_nguoi_choi = sc.nextLine();
		gio_vao = sc.nextLine();
		gio_ra = sc.nextLine();
		Date d1 = new SimpleDateFormat("HH:mm").parse(gio_vao);
		Date d2 = new SimpleDateFormat("HH:mm").parse(gio_ra);
		time = d2.getTime() - d1.getTime();
		time = TimeUnit.MILLISECONDS.toMinutes(time);
		gio = time/60;
		phut = time%60;
	}
	public String toString()
	{
		String s = ma_nguoi_choi + " " + ten_nguoi_choi + " " + gio + " gio " + phut + " phut";
		return s;
	}
}
public class J05011 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<GAME_THU> danh_sach_game_thu = new ArrayList<GAME_THU>();
		while(n-->0)
		{
			GAME_THU g = new GAME_THU();
			g.input(sc);
			danh_sach_game_thu.add(g);
		}
		danh_sach_game_thu.sort(new Comparator<GAME_THU>() {
			@Override
			public int compare(GAME_THU a , GAME_THU b)
			{
				if(a.gio>b.gio) return -1;
				if(a.gio==b.gio&&a.phut>b.phut) return -1;
				return 1;
			}
		});
		for(GAME_THU tmp: danh_sach_game_thu) System.out.println(tmp);
	}
}
