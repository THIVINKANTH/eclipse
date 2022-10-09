package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class SecureRead {

	public static void main(String[] args) throws IOException {
		File obj=new File("E:\\JavaFiles\\tk.txt");
		FileInputStream fis=new FileInputStream(obj);
		InflaterInputStream iis=new InflaterInputStream(fis);
		byte arr[]=new byte[fis.available()];
		iis.read(arr);
		System.out.println(new String(arr));
		iis.close();
		fis.close();
	}

}
