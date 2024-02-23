import java.util.Scanner;

public class to_devise {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);

        System.out.println("ENTER THE AMOUNT YOU WANT TO TRANSFER : ");
        double MAD = scanner.nextDouble();

        System.out.println("ENTER THE CURRENCY YOU WANT TO CONVERT TO / USD / EUR / GBP / DZD/ SAD / : ");
        String devi = scanner.next();



        double USD = 0.11;
        double EUR = 0.10;
        double GBP = 0.09;
        double DZD = 13.20;
        double SAD = 0.41;

        if(devi.equals("USD"))
        {
            double tr = MAD * USD;
            System.out.println("THE CONVERTED AMOUNT IN USD :" + tr);
        }else if (devi.equals("EUR")) {
            double tr = MAD * EUR;
            System.out.println("THE CONVERTED AMOUNT IN EUR :" + tr);
        }else if (devi.equals("GBP")) {
            double tr = MAD * GBP;
            System.out.println("THE CONVERTED AMOUNT IN GBP :" + tr);
        }else if (devi.equals("DZD")) {
            double tr = MAD * DZD;
            System.out.println("THE CONVERTED AMOUNT IN DZD:" + tr);
        }else if (devi.equals("SAD")) {
            double tr = MAD * SAD;
            System.out.println("THE CONVERTED AMOUNT IN SAD :" + tr);
        }

    }
}