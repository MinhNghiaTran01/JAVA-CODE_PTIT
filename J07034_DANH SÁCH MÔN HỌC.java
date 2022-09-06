import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class dsmh
{
	String mamon,tenmon,sotinchi;

	public dsmh(String mamon, String tenmon, String sotinchi) {
		this.mamon = mamon;
		this.tenmon = tenmon;
		this.sotinchi = sotinchi;
	}
	public String toString()
	{
		String s = this.mamon + " " + this.tenmon + " " + this.sotinchi;
		return s;
	}
}
public class TMN {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("MONHOC.in"));
		int t = sc.nextInt();
		List<dsmh> list = new ArrayList<dsmh>();
		while(t-->0)
		{
			sc.nextLine();
			String mamon = sc.next();
			sc.nextLine();
			String tenmon = sc.nextLine();
			String sotinchi = sc.next();
			dsmh a = new dsmh(mamon,tenmon,sotinchi);
			list.add(a);
		}
		list.sort(new Comparator<dsmh>() {
			@Override
			public int compare(dsmh a, dsmh b)
			{
				if(a.tenmon.compareTo(b.tenmon)<0) return -1;
				return 1;
			}
		});
		for(dsmh a : list) System.out.println(a);
	}
}
