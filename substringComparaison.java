import java.util.Scanner;
public class substringComparaison {
    
    private static String compareString(String s, int k)
    {
        String smallest = s.substring(0, k);
        String largest = s.substring(0,k);

        for(int i = 0; i < s.length()-k; i++)
        {
            String sub = s.substring(i, i + k);
            if(sub.compareTo(smallest) < 0)
            {
                smallest = sub;
            }
            if (sub.compareTo(largest) > 0) {
                largest = sub;
            }
            
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int i = sc.nextInt();
        System.out.println(compareString(s, i));
    }
}
