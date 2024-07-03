
import java.io.File;

public class file {

    public static void main(String[] args) {
        File file = new File("test.txt");

        if(file.exists())
        {
            System.out.println("\n"+">>>>exist<<<<");
        }
        else{
            System.out.println("\n"+">>>>does not exist<<<<");
        }
    }
}