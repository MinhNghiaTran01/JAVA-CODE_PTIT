import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Don_Hang
{
    String ma_don_hang,hang_san_xuat,ten_hang;
    double so_luong,don_gia,thue=0,thanh_tien;
    void input(Scanner sc)
    {
        ma_don_hang = sc.next();
        so_luong = sc.nextDouble();
        if(ma_don_hang.charAt(0)=='X')
        {
            don_gia = 128000;
            thue = 0.03;
        }
        else if(ma_don_hang.charAt(0)=='D')
        {
            don_gia = 11200;
            thue = 0.035;
        }
        else if(ma_don_hang.charAt(0)=='N')
        {
            don_gia = 9700;
            thue = 0.02;
        }
        String ma_hang_san_xuat = ma_don_hang.substring(ma_don_hang.length()-2);
        if(ma_hang_san_xuat.equals("BP")) ten_hang = "British Petro";
        else if(ma_hang_san_xuat.equals("ES")) ten_hang = "Esso";
        else if(ma_hang_san_xuat.equals("SH")) ten_hang = "Shell";
        else if(ma_hang_san_xuat.equals("CA")) ten_hang = "Castrol";
        else if(ma_hang_san_xuat.equals("MO")) ten_hang = "Mobil";
        else ten_hang = "Trong Nuoc";
        if(ten_hang.equals("Trong Nuoc")==false)
        {
            thue = thue*(don_gia*so_luong);
        }
        thanh_tien = (don_gia*so_luong) + thue;
    }
    void ouput()
    {
        DecimalFormat f = new DecimalFormat("#");
        System.out.println(ma_don_hang + " " + ten_hang + " " + f.format(don_gia) + " " + f.format(thue) + " " + f.format(thanh_tien));
    }
}
public class J05067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Don_Hang> danh_sach_don_hang = new ArrayList<>();
        while(n-->0)
        {
            Don_Hang tmp = new Don_Hang();
            tmp.input(sc);
            danh_sach_don_hang.add(tmp);
        }
        for(Don_Hang tmp : danh_sach_don_hang) tmp.ouput();
}
}
