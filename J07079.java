import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class J07079 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.in"));
		//ArrayList<String> arr1 = new ArrayList<String>();
		//arr1.add("12122");
		//arr1.add("9999999000000000000000000");
		//oos.writeObject(arr1);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String> arr = new ArrayList<String>();
		arr = (ArrayList<String>) ois.readObject();
		for(int i=0;i<arr.size();i++)
		{
			BigInteger value_thap_phan = new BigInteger("0");
			String gia_tri_nhi_phan = "";
			long tmp=1;
			for(int j=arr.get(i).length()-1;j>=0;j--)
			{
				if(arr.get(i).charAt(j)=='0'||arr.get(i).charAt(j)=='1') 
				{
					gia_tri_nhi_phan=arr.get(i).charAt(j) + gia_tri_nhi_phan;
					if(gia_tri_nhi_phan.length()>1) tmp*=2;
					if(arr.get(i).charAt(j)=='1')	
					{
						value_thap_phan = value_thap_phan.add(BigInteger.valueOf(tmp));
					}
				}
			}
			if( gia_tri_nhi_phan.length()>0 )	System.out.println(gia_tri_nhi_phan + " " + value_thap_phan);
		}
		ois.close();
	}
}
