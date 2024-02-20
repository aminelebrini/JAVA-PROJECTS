import java.util.Scanner;

public class hangman_game {
    
    public static void main(String[] args)
    {
        String n = "HELLO";
        String n1 = "CODING";
        String n2 = "JAVA";
        String n3 = "PROGRAMMING";
        String n4 = "COMPUTER";
        String n5 = "DELL";

        Scanner scanner = new Scanner(System.in);

        System.out.println("H__LO");
        System.out.println("ENTER THE WORD : ");
        String nn = scanner.next();

        if (nn.equals(n)) {
            System.out.println("Congratulations, let's go to the second question >>>>>>>");
            System.out.println("C__I_G");
            System.out.println("ENTER THE WORD : ");
            String nn1 = scanner.next();
            if (nn1.equals(n1)) {
                System.out.println("Congratulations, let's go to the third question >>>>>>>");
                System.out.println("J_V_A");
                System.out.println("ENTER THE WORD : ");
                String nn2 = scanner.next();
                if (nn2.equals(n2)) {
                    System.out.println("Congratulations, let's go to the fourth question >>>>>>>");
                    System.out.println("P________NG");
                    System.out.println("ENTER THE WORD : ");
                    String nn3 = scanner.next();
                    if (nn3.equals(n3)) {
                        System.out.println("Congratulations, let's go to the fifth question >>>>>>>");
                        System.out.println("C________");
                        System.out.println("ENTER THE WORD : ");
                        String nn4 = scanner.next();
                        if (nn4.equals(n4)) {
                            System.out.println("Congratulations, let's go to the last question >>>>>>>");
                            System.out.println("D___");
                            System.out.println("ENTER THE WORD : ");
                            String nn5 = scanner.next();
                            if (nn5.equals(n5)) {
                                System.out.println("Congratulations, you won!");
                            } else {
                                System.out.println("Wrong guess, try again!");
                            }
                        } else {
                            System.out.println("Wrong guess, try again!");
                        }
                    } else {
                        System.out.println("Wrong guess, try again!");
                    }
                } else {
                    System.out.println("Wrong guess, try again!");
                }
            } else {
                System.out.println("Wrong guess, try again!");
            }
        } else {
            System.out.println("Wrong guess, try again!");
        }

        scanner.close();
    }
}
