package OOP;

public class BankAccoount {
	private String accountNumber;
	private String name;
	private double balance;
	private String password;
	public BankAccoount(String accountNumber, String name, double balance, String password) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;
		this.password = password;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean checkAccount(String accName,String psw) {
		String []accountNumber= {"001kk","002kk","003kk","004kk"};
		String pasArr[]= {"4455$$","78986$","89654&&","78975^^"};
		for(int i=0;i<accountNumber.length;i++) {
			if(accountNumber[i].equals(accName)&& pasArr[i].equals(psw))
				return true;
		}
		return false;
		
	}
	public boolean deposit(double amount) {
		if(checkAccount(this.accountNumber, this.password))
		{
			this.balance+=amount;
			return true;
		}
		else { System.out.println("Invalid account");
			return false;}
		
	}
	public boolean withdraw(double amount) {
		return false;
		
		
	}

}
