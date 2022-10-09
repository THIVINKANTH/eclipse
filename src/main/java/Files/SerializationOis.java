package Files;

import java.io.*;

public class SerializationOis {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File Obj=new File("E:\\JavaFiles\\divya.txt");
        FileInputStream fis=new FileInputStream(Obj);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Mobile tmp=(Mobile)ois.readObject();
        System.out.println(tmp.brand+" "+tmp.model+" "+tmp.prize+" "+tmp.ram+" "+tmp.internal);
        ois.close();
        fis.close();
  }
}
