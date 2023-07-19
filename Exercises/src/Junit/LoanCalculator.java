package Junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public  class LoanCalculator{
	
	public double calculateInterest(double principle,double rate,int years)
{
	double interest=principle*rate*years;
	return interest;
}
}
