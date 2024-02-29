package fileinputoutput_demo;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSequentialFile {
private ObjectInputStream input;
	public ReadSequentialFile() {
		
	}
public void openFile() {
	try {
		input=new ObjectInputStream(new FileInputStream("client.ser"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void readRecord() {
	AccountRecordSerializable record;
	System.out.printf("%-10s%-12s%-12s%10s\n","Account","First Name","Last Name","Balance");
	while(true) {
	try {
		record=(AccountRecordSerializable)input.readObject();
		System.out.printf("%-10s%-12s%-12s%10.2f\n", record.getAccount(),record.getFirstName(),record.getLastName(),record.getBalance());
	} 
	catch(EOFException e) {
		System.err.println("File end:");
		return;
	}
	catch (ClassNotFoundException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
public void closeFile() {
	if(input!=null) {
		try {
			input.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
public static void main(String[] args) {
	ReadSequentialFile obj=new ReadSequentialFile();
	obj.openFile();
	obj.readRecord();
	obj.closeFile();
}
}
