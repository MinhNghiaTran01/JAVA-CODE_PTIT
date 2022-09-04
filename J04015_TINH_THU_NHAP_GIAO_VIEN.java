import java.util.Scanner;

public class J04015 {
	String name,ma;
	long luong;
	
	public J04015(String ma, String name, long luong) {
		this.name = name;
		this.ma = ma;
		this.luong = luong;
	}
	long phucap()
	{
		String s = this.ma.substring(0,2);
		if(s.equals("HP")) return 900000;
		if(s.equals("HT")) return 2000000;
		if(s.equals("GV")) return 500000;
		return 1;
	}
	long bac_luong()
	{
		String s = this.ma.substring(2);
		long x = (s.charAt(0) - '0')*10 + s.charAt(1) - '0';
		return x;
 	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ma = sc.next(); sc.nextLine();
		String name = sc.nextLine();
		J04015 gv = new J04015(ma,name, sc.nextLong());
		System.out.println(gv.ma + " " + gv.name + " " + gv.bac_luong() + " " + gv.phucap() + " " + (gv.luong*gv.bac_luong()+gv.phucap()));
	}
}
