public class stringtoInteger {

    public static void main(String args[]) 
    { 
       String s = "-42";
       int j = Integer.parseInt(s);

       System.out.println(j);

       //Verify whether the variable has been converted to a Integer

       int x = 2;

       System.out.println(j + x);
    } 
}