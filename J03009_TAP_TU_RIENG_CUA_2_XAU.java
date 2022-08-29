import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class J03009_TAP_TU_RIENG_CUA_2_XAU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0)
		{
			Set<String> set = new TreeSet<String>();
			String s1 = sc.nextLine();
			String s2 = sc.nextLine();
			for(String word : s1.split(" "))
			{
				if(s2.contains(word)!=true)
				{
					set.add(word);
				}
			}
			for(String word : set)
			{
				System.out.print(word + " ");
			}
			System.out.println();
		}
	}
}
