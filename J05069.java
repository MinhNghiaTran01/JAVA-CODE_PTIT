
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Doi_Bong
{
    String ma,ten;
    long gia_ve;
    void input(Scanner sc)
    {
        sc.nextLine();
        ma = sc.nextLine();
        ten = sc.nextLine();
        gia_ve = sc.nextLong();
    }
}
public class J05069 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Doi_Bong> danh_sach_doi_bong = new ArrayList<>();
        while(n-->0)
        {
            Doi_Bong tmp = new Doi_Bong();
            tmp.input(sc);
            danh_sach_doi_bong.add(tmp);
        }
        int t = sc.nextInt();
        while(t-->0)
        {
            String ma_tran = sc.next();
            long so_co_dong_vien = sc.nextLong();
            String ma = ma_tran.substring(1,3);
            for(int i=0;i<danh_sach_doi_bong.size();i++)
            {
                if(ma.equals(danh_sach_doi_bong.get(i).ma))
                {
                    long thanh_tien = danh_sach_doi_bong.get(i).gia_ve*so_co_dong_vien;
                    System.out.println(ma_tran + " " + danh_sach_doi_bong.get(i).ten + " " + thanh_tien);
                    break;
                }
            }
        }
}
}
