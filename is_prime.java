import java.util.Scanner;

public class is_prime {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR NUMBER : ");
        int n = scanner.nextInt();

        int i = 2;

        while (n % n == 0 && n % 1 == 0) {
            if (n % i == 0)
            {
                 System.out.println("is not prime");
            }
            else{
                System.out.println("is prime");
            }
            i++;
        }
        
        
    }
    
}
