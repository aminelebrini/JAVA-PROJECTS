import java.util.Scanner;

public class solv_equation {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose type of your equation (ax + b = c) / (a + bx = c) / (a + b = cx): ");
        String eq = scanner.nextLine();

        if (eq.equals("ax + b = c")) {
            System.out.println("Enter a : ");
            int a = scanner.nextInt();

            if (a == 0) {
                System.out.println("Invalid input. 'a' cannot be zero.");
                return;
            }

            System.out.println("Enter b : ");
            int b = scanner.nextInt();

            System.out.println("Enter c : ");
            int c = scanner.nextInt();

            double x = (double) (c - b) / a; // Utilisation d'un cast pour s'assurer que la division est réelle

            System.out.println("x = " + x);
   
        } else if (eq.equals("a + bx = c")) {
            System.out.println("Enter b : ");
            int b = scanner.nextInt();

            if (b == 0) {
                System.out.println("Invalid input. 'a' cannot be zero.");
                return;
            }

            System.out.println("Enter a : ");
            int a = scanner.nextInt();

            System.out.println("Enter c : ");
            int c = scanner.nextInt();

            double x = (double) (c - a) / b; // Utilisation d'un cast pour s'assurer que la division est réelle

            System.out.println("x = " + x);
   
        }
        else if (eq.equals("a + b = cx")) {
            System.out.println("Enter c : ");
            int c = scanner.nextInt();

            if (c == 0) {
                System.out.println("Invalid input. 'a' cannot be zero.");
                return;
            }

            System.out.println("Enter a : ");
            int a = scanner.nextInt();

            System.out.println("Enter b : ");
            int b = scanner.nextInt();

            double x = (double) (a + b) / c; // Utilisation d'un cast pour s'assurer que la division est réelle

            System.out.println("x = " + x);
   
        }
        
        scanner.close();
    }
}
