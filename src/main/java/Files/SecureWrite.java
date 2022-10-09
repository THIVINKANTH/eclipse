package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class SecureWrite {

	public static void main(String[] args) throws IOException {
		File obj= new File("E:\\JavaFiles\\tk.txt");
		obj.createNewFile();
		FileOutputStream fos=new FileOutputStream(obj);
		DeflaterOutputStream dos= new DeflaterOutputStream(fos);
		Scanner scan= new Scanner(System.in);
		System.out.println("please type the content to store into the file");
		String content="",answer="";
		while(true)
		{
			content+=scan.nextLine();
			answer+=scan.nextLine();
			if(answer.equalsIgnoreCase("finish"))
				break;
		}
		dos.write(content.getBytes());
		System.out.println(obj.getName()+"file successfully written");
		dos.close();
		fos.close();
		scan.close();
	}

}
