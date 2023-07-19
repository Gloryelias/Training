package OOPConcepts;

class Account
{
	public int accountNumber;
	public String accountHolderName;
	private float Balance=3000;
	
	public void withdrawMoney(float amountToWithdraw)
	{   if(Balance>amountToWithdraw)
	    {
		Balance=Balance-amountToWithdraw;
		System.out.println(Balance);
	    }
	else
	{
		System.out.println("Insufficient");
	}
	
	}
}
public class Encapsulation_bank 
{
 public static void main(String args[])
 {
	Account acc=new Account();
	acc.accountNumber=145001;
	acc.accountHolderName="Glory";
	acc.withdrawMoney(3000);
	
 }
}

