import java.util.Scanner;

public class rev_str {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WRITE YOUR STRING : ");
        String n = scanner.next();

        int i;
        for(i = n.length() - 1; i >= 0; i--) {
            System.out.println(n.charAt(i));
        }
    }
}