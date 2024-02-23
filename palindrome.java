import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("ENTER YOUR NUM TO CHECK : ");
		int n = scanner.nextInt();

		if (ispalindrome(n)) {
			
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("is not palindrome");
		}
	}
	public static boolean ispalindrome(int x)
	{
		int original = x;
		int rev = 0;
		int res;
		while (x > 0) {
			
			res = x % 10;
			rev = rev * 10 + res;
			x /= 10;
		}
		return original==rev;
	}
}