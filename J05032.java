import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Person
{
	String ho_ten, ngay_sinh;
	long time;
	void input(Scanner sc) throws ParseException
	{
		ho_ten = sc.next();
		ngay_sinh = sc.next();
		Date d =  new SimpleDateFormat("dd/MM/yyyy").parse(ngay_sinh);
		time = d.getTime();
	}
	void output()
	{
		
	}
}
public class J05032 {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Person> danh_sach_person = new ArrayList<Person>();
		while(t-->0)
		{
			Person p = new Person();
			p.input(sc);
			danh_sach_person.add(p);
		}
		danh_sach_person.sort(new Comparator<Person>() {
			@Override
			public int compare(Person a, Person b)
			{
				if(a.time>b.time) return -1;
				return 1;
			}
		});
		System.out.println(danh_sach_person.get(0).ho_ten);
		System.out.println(danh_sach_person.get(danh_sach_person.size()-1).ho_ten);
		
	}
}
