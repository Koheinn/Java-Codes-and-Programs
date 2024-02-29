package fileinputoutput_demo;

import java.io.File;
import java.io.IOException;

public class FileTesting {
public FileTesting() {
	File obj=new File("D:\\fileInputOutput\\testOne.txt");
	try {
		if(obj.createNewFile()) {
			System.out.println("File created successfully: "+obj);
		}
		else {
			System.out.println("File already exits");
		}
	}
	catch(IOException e){
		e.printStackTrace();
	}
}
	public static void main(String[] args) {
		new FileTesting();

	}

}
