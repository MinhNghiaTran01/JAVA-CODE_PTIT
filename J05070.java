
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
class Doi_Bong
{
    String ma,ten,ma_tran;
    long gia_ve,doanh_thu;
    void input(Scanner sc)
    {
        sc.nextLine();
        ma = sc.nextLine();
        ten = sc.nextLine();
        gia_ve = sc.nextLong();
    }
    void set_doanh_thu(long so_co_dong_vien,String ma_tran)
    {
        doanh_thu = gia_ve*so_co_dong_vien;
        this.ma_tran = ma_tran;
    }
    void output()
    {
        System.out.println(ma_tran + " " + ten + " " + doanh_thu);
    }
}
public class J05070 {
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
                    danh_sach_doi_bong.get(i).set_doanh_thu(so_co_dong_vien,ma_tran);
                    break;
                }
            }
        }
        danh_sach_doi_bong.sort(new Comparator<Doi_Bong>(){
            @Override
            public int compare(Doi_Bong a, Doi_Bong b)
            {
                if(a.doanh_thu>b.doanh_thu) return -1;
                return 1;
            }
        });
        for(Doi_Bong tmp: danh_sach_doi_bong) tmp.output();
}
}
