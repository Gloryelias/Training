package Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class junittest {

	@Test
	public void testCalculatorInterest() {
	 LoanCalculator f=new LoanCalculator();
	double res=f.calculateInterest(10000.0,0.05,3);
	 assertEquals(1500.0,res);
}
}
