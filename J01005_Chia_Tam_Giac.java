import java.util.Scanner;

public class Chia_Tam_Giac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-->0)
		{
			double n = sc.nextDouble();
			double h = sc.nextDouble();
			double area = 1.0/2.0*h/n;
			for(int i=1;i<n;i++)
			{	
				System.out.printf("%.6f",h*Math.sqrt((area*i)/(1.0*h/2.0)));
				System.out.print(' ');
			}
			System.out.println();
		}
	}
}
