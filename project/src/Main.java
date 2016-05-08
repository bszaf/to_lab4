import java.io.*;
import java.util.*;

public class Main {

    public static String filename = "data.txt";

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {

        PrintWriter writer = new PrintWriter(filename, "UTF-8");
        writer.println("The first line");
        writer.println("The second line");
        writer.close();

        byte[] byteArray = null;

        HashInterface mode = new EncoderMD5();
        try {
           byteArray = mode.encode(new File(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(byteArray));
    }

}
