import java.util.Scanner;

public class J02012_SAP_XEP_CHEN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n+1];
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		//for(int i=0;i<n;i++) System.out.print(a[i] + " ");
		for(int i=0;i<n;i++)
		{
			int j = i;
			
			while(j>0)
			{
				if(a[j]<a[j-1])
				{
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
					j--;
				}
				else break;
			}
			System.out.print("Buoc " + (i) + ": ");
			
			for(int j1=0; j1<=i; j1++)
			{
				System.out.print(a[j1] + " ");
			}
			System.out.println();
		}
	}
}
