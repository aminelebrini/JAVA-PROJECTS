import java.util.Scanner;

public class convert{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("ENTER THE TEMPERATURE TO CONVERT : ");
		int c = scanner.nextInt();

		int con = (c * 9/5) + 32;
		System.out.println(con);
	}
}
