package OOPConcepts;
class Account1
{
	public int accountNumber;
	public String accountHolderName;
	private float Balance=3000;
	class SBAccount extends Account1
	{
		 int tenure;
		boolean autoRenewal ;
	}
	
	class FDAccount extends Account1
	{
		String tenure;
		boolean autoRenewal ;
	}
	class CurrentAccount extends Account1
		{
		double overDraftLimit;
		}
		class LoanAccount extends Account1
		{
			int EMI;
			int loanOutStanding;
			int tenure;
		}
	}


public class Inheritance_bank 
{

	public static void main(String[] args)
	{
		
         
	}

}
