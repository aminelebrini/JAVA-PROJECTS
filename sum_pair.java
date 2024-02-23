import java.util.Scanner;

public class sum_pair{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("ENTER THE MAX NUM :" );
		int n = scanner.nextInt();

		int i = 1;
		int j = 0;
		for(i = 1; i <= n; i++)
		{
			if(i % 2==0)
			{
				j += i;
				System.out.println(j);
			}
		}
	}	
}
