package objectOrientedProgramming;

class BankAccount{
//Private fields
  private String accountNumber;
  private double balance;
  private String accountHolderName;
public BankAccount(String accountNumber, double balance, String accountHolderName) {
	super();
	this.accountNumber = accountNumber;
	this.balance = balance;
	this.accountHolderName = accountHolderName;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public String getAccountHolderName() {
	return accountHolderName;
}
public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName = accountHolderName;
}
@Override
public String toString() {
	return "BankAccount [accountNumber=" + accountNumber + ", balance=" + balance + ", accountHolderName="
			+ accountHolderName + ", getBalance()=" + getBalance() + "]";
}

  public void deposit(double amount) {
	  if(amount>0) {
		  balance+=amount;
	  }
	  else {
		  System.out.println("Deposit must be postive");
	  }
  }
  
  public boolean withdraw(double amount) {
	  if(amount>0 && amount <=balance) {
		  balance-=amount;
		  return true;
	  }
	  else {
		  System.out.println("Insufficent balance");
		  return false;
	  }
	
	  
  }
  
}


public class Encapsulation {

	public static void main(String[] args) {
		BankAccount b = new BankAccount("Savings Account",0,"Chaithra");
		b.deposit(1000);
		System.out.println(b.toString());
		b.withdraw(500);
		System.out.println(b.toString());
		b.withdraw(500);
		System.out.println(b.toString());
		
		b.withdraw(500);// insuffient Balance
		
		b.deposit(0);

	}

}
