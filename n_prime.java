import java.util.Scanner;
public class n_prime {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the max num : ");
        int w = scanner.nextInt();

        int i = 2;

        
            while (i <= w) {
                boolean isprime = true;
                for( int n = 2 ; n <= Math.sqrt(i); n++)
                {
                    if(i % n == 0)
                    {
                        isprime = false;
                        break;
                    }
                }
                if(isprime)
                {
                    System.out.println(i);
                }
                i++;
        }
    }
}