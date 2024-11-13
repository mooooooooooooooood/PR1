package PR1.tut10;

import java.io.*;
import java.util.ArrayList;

public class act3 {
    public static void main(String[] args) throws Exception{
        File file = new File ("src\\lecture\\tut10\\data.bin");

        // Đọc dữ liệu từ file data.bin
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // Đọc đối tượng ArrayList từ file
        ArrayList<String> readArrayList = (ArrayList<String>)objectInputStream.readObject();
        objectInputStream.close();

        // Hiển thị các chuỗi trong đối tượng ArrayList
        for (String item : readArrayList) {
            System.out.println(item);
        }
    }
}
