
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class lo_hang
{
    static Map<String,Integer> map = new HashMap<>();
    String ten_hang,ma_hang="";
    double so_luong, don_gia,phan_tram_chieu_khau=0.0;
    double chieu_khau,thanh_tien;
    void input(Scanner sc)
    {
        sc.nextLine();
        ten_hang = sc.nextLine();
        so_luong = sc.nextDouble();
        don_gia = sc.nextDouble();
        String str[] = ten_hang.split("\\s+");
        ma_hang += str[0].charAt(0);
        ma_hang += str[1].charAt(0);
        if(map.containsKey(ma_hang))
        {
            int value = map.get(ma_hang);
            map.put(ma_hang, value+1);
            ma_hang+= "0" + String.valueOf(value+1);
        }
        else
        {
            map.put(ma_hang, 1);
            ma_hang += "0" + String.valueOf(1);
        }
        ma_hang = ma_hang.toUpperCase();
        
        if(so_luong>10) phan_tram_chieu_khau = 0.05;
        else if(so_luong>=8) phan_tram_chieu_khau = 0.02;
        else if(so_luong>=5) phan_tram_chieu_khau = 0.01;
        
        chieu_khau = (double) (don_gia*so_luong*phan_tram_chieu_khau);
        thanh_tien = so_luong*don_gia - chieu_khau;
    }
    void output()
    {
        DecimalFormat f = new DecimalFormat("#");
        System.out.println(ma_hang + " " + ten_hang + " " + f.format(chieu_khau) + " " + f.format(thanh_tien));
    }
}
public class J05046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<lo_hang> danh_sach_lo_hang = new ArrayList<>();
        int n = sc.nextInt();
        while(n-->0)
        {
            lo_hang tmp = new lo_hang();
            tmp.input(sc);
            danh_sach_lo_hang.add(tmp);
        }
        for(lo_hang tmp: danh_sach_lo_hang) tmp.output();
    }
}
