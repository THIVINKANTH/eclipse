package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DemoReading {

	public static void main(String[] args) throws IOException {
		File obj=new File("E:\\JavaFiles\\thivin.txt");
		FileInputStream fis= new FileInputStream(obj);
		int size=fis.available();
		byte[] temp=new byte[size];
		// read and copy to byte array
		fis.read(temp);
		String data=new String(temp);
		System.out.println(data+"\n is the content available in the file"+obj.getAbsolutePath());
		fis.close();

	}

}
