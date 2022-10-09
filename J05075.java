
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sinh_Vien
{
    String ma_sinh_vien,ho_ten,lop;
    String ghi_chu;
    int diem_chuyen_can;
    void input(Scanner sc)
    {
        ma_sinh_vien = sc.nextLine();
        ho_ten = sc.nextLine();
        lop = sc.nextLine();
    }
    void tinh_diem_chuyen_can(String diem_danh)
    {
        int cnt=0;
        for(int i=0;i<diem_danh.length();i++)
        {
            if(diem_danh.charAt(i)=='v') cnt+=2;
            else if(diem_danh.charAt(i)=='m') cnt+=1;
        }
        diem_chuyen_can = 10 - cnt;
        if(diem_chuyen_can<0) diem_chuyen_can = 0;
    }
    void output()
    {
        if(diem_chuyen_can==0) ghi_chu = "KDDK";
        else ghi_chu="";
        System.out.println(ma_sinh_vien + " " + ho_ten + " " + lop + " " + diem_chuyen_can + " " + ghi_chu);
    }
}
public class J05075 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<Sinh_Vien> danh_sach_sinh_vien = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            Sinh_Vien sv = new Sinh_Vien();
            sv.input(sc);
            danh_sach_sinh_vien.add(sv);
        }
        for(int i=1;i<=n;i++)
        {
            String s[] = sc.nextLine().split("\\s+");
            String ma_sinh_vien = s[0];
            String diem_danh = s[1];
            for(Sinh_Vien tmp: danh_sach_sinh_vien)
            {
                if(tmp.ma_sinh_vien.equals(ma_sinh_vien))
                {
                    tmp.tinh_diem_chuyen_can(diem_danh);
                }
            }
        }
        String ma_lop = sc.next();
        for(Sinh_Vien tmp: danh_sach_sinh_vien)
        {
            if(tmp.lop.equals(ma_lop)) tmp.output();
        }
    }
}
