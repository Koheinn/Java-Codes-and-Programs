package fileinputoutput_demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderDemo {
public FileReaderDemo() {
	File obj=new File("D:\\fileInputOutput\\testOne.txt");
	try {
		Scanner fileReader=new Scanner(obj);
		while(fileReader.hasNextLine()) {
			String l=fileReader.nextLine();
			System.out.println(l);
		}
		fileReader.close();
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		new FileReaderDemo();

	}

}
