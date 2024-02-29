package fileinputoutput_demo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileExercise {
public FileExercise() throws IOException {
	Scanner ip=new Scanner(System.in);
	FileWriter fw=new FileWriter("D:\\fileInputOutput\\testTwo.txt");
	System.out.println("Enter Something to file: if you wanna stop, press exit:");
	String input=ip.nextLine();
	while(!input.equalsIgnoreCase("exit")) {
		fw.write(input+"\n");
		input=ip.nextLine();
	}
	System.out.println("The End:");
	fw.close();
}
	public static void main(String[] args) throws IOException {
		new FileExercise();

	}

}
