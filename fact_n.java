import java.util.Scanner;

public class fact_n {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("WRITE YOUR NUMBER : ");
        int i = scanner.nextInt();
        int n = 1;
        int f = 1;
        while (n <= i) {
            f *= n;
            n++;
        }
        System.out.println(f);
        
        
        
    }
}