package week3.day1;

public class AxisBankOverride extends BankInfo{

	public void deposit()
	{
		System.out.println("5000 Deposit");
	}
	
	public static void main(String[] args) {
		
	BankInfo bank=new BankInfo();
	
	bank.deposit();
	}	

}
