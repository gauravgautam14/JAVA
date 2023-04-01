package ExceptionHandlingDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readfile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("d:/abc.txt");
	}

	void savefile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
	}
}

class Test2 {
	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
			rw.readfile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try
		{
			rw.savefile();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("hello");
	}

}