
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

class Number
{
    int key,so_lan_xuat_hien,vi_tri;

    public Number(int key, int so_lan_xuat_hien, int vi_tri) {
        this.key = key;
        this.so_lan_xuat_hien = so_lan_xuat_hien;
        this.vi_tri = vi_tri;
    }
    
}
public class J08011 {
	static int so_khong_giam(int n)
	{
		String s = String.valueOf(n);
		for(int i=1;i<s.length();i++)
		{
			if(s.charAt(i)<s.charAt(i-1)) return 0;
		}
		return 1;
	}
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        Vector<Number> ans = new Vector<>();
        int cnt = 0;
        while(sc.hasNext())
        {
            try
            {
                String s = sc.next();
                int n = Integer.parseInt(s);
                if(so_khong_giam(n)==0) continue;
                if(v.contains(n))
                {
                    int index = v.indexOf(n);
                    int so_lan_xuat_hien = ans.get(index).so_lan_xuat_hien + 1;
                    Number nb = new Number(n, so_lan_xuat_hien, ans.get(index).vi_tri);
                    ans.set(index, nb);
                }
                else
                {
                	ans.add(new Number(n, 1, cnt));
                	v.add(n);
                }
                cnt+=1;
            }
            catch(Exception e)
            {
                break;
            }
        }
        ans.sort(new Comparator<Number>(){
            @Override
            public int compare(Number a, Number b)
            {
                if(a.so_lan_xuat_hien>b.so_lan_xuat_hien) return -1;
                if(a.so_lan_xuat_hien==b.so_lan_xuat_hien&&a.vi_tri<b.vi_tri) return -1;
                return 1;
            }
        });
        for(Number tmp: ans)
        {
            System.out.println(tmp.key + " " +tmp.so_lan_xuat_hien);
        }
    }
}
