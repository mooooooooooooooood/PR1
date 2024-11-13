package PR1.tut10;
import java.io.*;
import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;

public class act2 {
    static public void main (String[] args) throws Exception {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("Rin");
        arr.add("Sakura");
        arr.add("Shiro");
        File file = new File ("src\\lecture\\tut10\\data.bin");
        FileOutputStream f = new FileOutputStream(file);
        ObjectOutputStream os = new ObjectOutputStream (f);
        os.writeObject(arr);
        os.close();
    }
}
