
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class devise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pay = sc.nextInt();

        NumberFormat MADmaroc = NumberFormat.getCurrencyInstance(new Locale("ar", "MA"));
        System.out.println(MADmaroc.format(pay));

    }
}
