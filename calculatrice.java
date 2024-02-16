import java.util.Scanner;

public class calculatrice {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ENTRER N1 : ");
        int n = scanner.nextInt();

        System.out.println("ENTRER OPERATION : ");
        String opp = scanner.next();

        System.out.println("ENTRER N2 : ");
        int n2 = scanner.nextInt();

        if (opp.equals("+")) {
            System.out.println(n + n2);
        } else if (opp.equals("-")) {
            System.out.println(n - n2);
        } else if (opp.equals("*")) {
            System.out.println(n * n2);
        } else if (opp.equals("/")) {
            System.out.println(n / n2);
        } else {
            System.out.println("Opérateur invalide");
        }

        scanner.close();
    }
}