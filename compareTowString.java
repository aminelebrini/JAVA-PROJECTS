import java.util.Scanner;
public class compareTowString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        int len = a.length() + b.length();
        System.out.println(len);

        if(a.compareTo(b) > 0)
        {
            System.out.println("yes");
        }else{
            System.out.println("No");
        }

        String r1 = a.substring(0,1).toUpperCase() + a.substring(1);
        String r2 = b.substring(0,1).toUpperCase() + b.substring(1);
        System.out.println(r1+" "+r2);
    }
}
