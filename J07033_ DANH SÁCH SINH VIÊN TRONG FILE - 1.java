import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class dssv
{
	String msv,name,lop,email;
	

	
	public dssv(String msv, String name, String lop, String email) {
		this.msv = msv;
		this.name = name;
		this.lop = lop;
		this.email = email;
	}

	public void chuan_hoa()
	{
		this.name = this.name.toLowerCase();
		String s = "";
		for(int i=0;i<this.name.length();i++)
		{
			if(i==0||(this.name.charAt(i-1)==' '&&this.name.charAt(i)!=' '))
			{
				s+=" ";
				char x = this.name.charAt(i);
				s+= Character.toUpperCase(x);
			}
			else if(this.name.charAt(i)!=' ') s+=this.name.charAt(i);
		}
		this.name = s;
	}

	public String toString()
	{
		chuan_hoa();
		String s = this.msv + " " + this.name + " " + this.lop + " " + this.email;
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("SINHVIEN.in"));
		int t = sc.nextInt();
		List<dssv> list = new ArrayList<dssv>();
		while(t-->0)
		{
			sc.nextLine();
			String msv = sc.next();
			sc.nextLine();
			String name = sc.nextLine();
			String lop = sc.next();
			String email = sc.next();
			dssv a = new dssv(msv, name, lop, email);
			list.add(a);
		}
		list.sort(new Comparator<dssv>() {
			@Override
			public int compare(dssv a, dssv b)
			{
				if(a.msv.compareTo(b.msv)<0) return -1;
				return 1;
			}
		});
		for(dssv a : list) System.out.println(a);
	}
}
