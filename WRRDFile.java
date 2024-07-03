import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WRRDFile {

    public static void main(String[] args) {
        try{
            BufferedWriter rt = new BufferedWriter(new FileWriter("your file direction"));
            rt.write("AMINE is Developer");
            rt.close();
            BufferedReader rd = new  BufferedReader(new FileReader("your file direction"));
            String line;

            while ((line= rd.readLine()) != null) {
                System.out.println(line+"\n");
            }
            rd.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
       


    }
}