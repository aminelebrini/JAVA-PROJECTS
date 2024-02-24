import java.util.Scanner;

public class div_deci {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTER YOUR DECI NUM : ");
        double n = scanner.nextDouble();

        System.out.println("ENTER YOUR NUM : ");
        int v = scanner.nextInt();

        double div = n / v;

        System.out.println(div);
    }
}