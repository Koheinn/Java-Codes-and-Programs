package fileinputoutput_demo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterDemo {
public FileWriterDemo() {
	try {
		FileWriter obj=new FileWriter("D:\\fileInputOutput\\testOne.txt");
		obj.write("A quick brown fox jumps over the lazy dog.");
		obj.close();
		System.out.println("Successfully write to file");
	}catch(IOException e) {
		System.err.println("Unexpected error occured");
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		new FileWriterDemo();

	}

}
