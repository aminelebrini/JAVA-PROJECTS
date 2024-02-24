import java.util.Scanner;

public class towInteger {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the dividend : ");
        double dividend = scanner.nextDouble();

        System.out.println("enter the divisor: ");
        double divisor = scanner.nextDouble();

        double div = dividend / divisor;
        if (dividend > 0 && divisor > 0) {
            
            System.out.println(div);
        }else if ((dividend > 0 && divisor < 0 ) || (dividend < 0 && divisor > 0)) {
            double s = div;
            System.out.println(s);
        }else if(dividend < 0 && divisor < 0)
        {
            double s = 1;
            System.out.println(div * s);
        }
    }
}