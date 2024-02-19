import java.util.Scanner;

public class moyen {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER ENTRY NUMBER : ");
        int n = scanner.nextInt();

        int i = 1;
        int n1;
        int sum = 0;
        float mo;

        for (i = 1; i<= n; i++)
        {
            System.out.println("ENTER ENTRY NUMBERS" + i + ": ");
            n1 = scanner.nextInt();
    
            sum += n1;
        }

        mo = sum / n;
        System.out.println(mo);
    }
}