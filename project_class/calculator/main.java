import java.util.Scanner;

public class main{

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);

		System.out.println("entrer un nombre n1 : ");
		int n1 = sc.nextInt();

		System.out.println("entrer un nombre n2 : ");
                int n2 = sc.nextInt();

		System.out.println("entrer un nombre operation : ");
                String opp = sc.next();
		
		if(opp.equals("+"))
		{
			calculator.add(n1,n2);
		}else if(opp.equals("-"))
		{
			calculator.subtract(n1, n2);
		}else if(opp.equals("*"))
		{
			calculator.multiply(n1,n2);
		}
		else if(opp.equals("/"))
		{
			calculator.divide(n1,n2);
		}
		sc.close();
	}
}
