package OOP;

import java.util.Scanner;

public class SavingAccount extends BankAccoount {

	public SavingAccount(String accountNumber, String name, double balance, String password) {
		super(accountNumber, name, balance, password);
		
	}
@Override
public boolean withdraw(double amount) {
	if(this.checkAccount(getAccountNumber(), getPassword())) {
		if(getBalance()>=1000) {
			if(amount<=(getBalance()-1000)) {
				double currentbalace=(getBalance()-1000)-amount;
				this.setBalance(currentbalace+1000);
				return true;
			}
			else {
				System.out.println("Not Enough to withdraw this amount");
				return false;
			}
			
		}
		else {
			System.out.println("Transaction unsuccessfully, below one thousand");
			return false;
		}
				
	}
	else {
		System.out.println("Invalid account");
		return false;
	}
}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		String c="";
		SavingAccount myAcc=null;
		do {
			System.out.println("Welcome from AAA bank:\n Choose(1 or 2) from Menu:\n1.Deposit\n2.Withdraw");
			int ch=ip.nextInt();
			if(ch==1) {
				System.out.println("Enter Account Name:");
				String accN=ip.next();
				System.out.println("Enter password:");
				String psw=ip.next();
				System.out.println("Enter deposit amount:");
				double amt=ip.nextDouble();
				myAcc=new SavingAccount(accN, "Thiri", 100000, psw);
				boolean flag=myAcc.deposit(amt);
				if(flag) {
					System.out.println("Transaction successfully"+" and current Balance "+myAcc.getBalance());
				}
				else {
					System.out.println("Sorry");
				}
			}
			if(ch==2) {
				System.out.println("Enter Account Name:");
				String accN=ip.next();
				System.out.println("Enter password:");
				String psw=ip.next();
				System.out.println("Enter withdraw amount:");
				double amt=ip.nextDouble();
				myAcc=new SavingAccount(accN, "Su Su", 10000, psw);
				boolean flag=myAcc.withdraw(amt);
				if(flag) {
					System.out.println("Transaction successfully"+" and current Balance "+myAcc.getBalance());
				}
				else {
					System.out.println("Sorry");
				}
			}
			System.out.println("Do you want to continue(yes or no)?");
			c=ip.next();
				
		}while(c.equals("yes"));
		
	}
}
