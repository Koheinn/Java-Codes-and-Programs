package fileinputoutput_demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class CreateSequentialFile {
private ObjectOutputStream output;

	public CreateSequentialFile() {
		
	}
public void openFile() {
	try {
		output=new ObjectOutputStream(new FileOutputStream("client.ser"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void addRecords() {
	AccountRecordSerializable record;
	int accountNumber=0;
	String firstName;
	String lastName;
	double balance;
	Scanner ip=new Scanner(System.in);
	System.out.printf("%s\n%s\n%s\n%s\n\n", "To terminate input,"
			+" type the end-of-file indicator",
			"when you are prompted to enter input.",
			"On UNIXLinux/Mac OS X type <ctrl> d then press Enter",
			"On Windows type <ctrl> z then press Enter");
	System.out.printf("%s\n%s", "Enter account number(>0),first name,"
			+" last name and balance","?");
	while(ip.hasNext()) {
		accountNumber=ip.nextInt();
		firstName=ip.next();
		lastName=ip.next();
		balance=ip.nextDouble();
		if(accountNumber>0) {
			record=new AccountRecordSerializable(accountNumber,firstName,lastName,balance);
			
				try {
					output.writeObject(record);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
		else {
			System.out.println("Account number must be greater than 0.");
		}
		System.out.printf("%s\n%s", "Enter account number(>0),"
				+"first name, last name and balance","?");
	}
}
public void closeFile() {
	if(output!=null) {
		try {
			output.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
	public static void main(String[] args) {
		CreateSequentialFile obj=new CreateSequentialFile();
		obj.openFile();
		obj.addRecords();
		obj.closeFile();

	}

}
