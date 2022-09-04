import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TMN {
	public static void main(String[] args) throws IOException {
		File f = new File("DATA.in");
		Scanner sc = new Scanner(f.toPath());
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
	}
}
