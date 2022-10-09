package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationOos {

	public static void main(String[] args) throws IOException {
		File obj= new File("E:\\JavaFiles\\divya.txt");
		obj.createNewFile();
		FileOutputStream fos=new FileOutputStream(obj);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Mobile m1=new Mobile();
		m1.brand="vivo";m1.model="y33t";m1.prize=20000;m1.ram=8;m1.internal=128;
		oos.writeObject(m1);
		oos.close();
		fos.close();

	}

}
class Mobile implements Serializable
{
	transient String brand;
	String model;
	int prize;
	int ram,internal;
}
