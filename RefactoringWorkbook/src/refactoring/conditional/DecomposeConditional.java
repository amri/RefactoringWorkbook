package refactoring.conditional;

import java.util.Date;

public class DecomposeConditional {
	private static final Date SUMMER_START = new Date();
	private static final Date SUMMER_END = new Date();
	private static int _summerRate;
	private static int _winterServiceCharge;
	private static int _winterRate;

	public static void main(String [] args)
	{
		Date date = new Date();
		int charge;
		int quantity = 0;
		if(notSummer(date))
		{
			charge = winterCharge(quantity);
		}
		else
		{
			charge = summerCharge(quantity);
		}
		
	}
	
	

	private int _seniority;
	private int _monthsDisabled;
	private boolean _isPartTime;

	double disabilityAmount()
	{
		if(isNotEligibleForDisability()) return 0;
	
		if(onVacation())
		{
			if(lengthOfService() > 10)
			{
				return 1;
			}
		}
		
		return 0;
		
	}

	private boolean onVacation() {
		// TODO Auto-generated method stub
		return false;
	}

	private int lengthOfService() {
		// TODO Auto-generated method stub
		return 0;
	}

	private boolean isNotEligibleForDisability() {
		return _seniority < 2 || _monthsDisabled > 12 || _isPartTime;
	}
	
	private static int summerCharge(int quantity) {
		return quantity * _summerRate;
	}

	private static int winterCharge(int quantity) {
		return summerCharge(quantity) + _winterServiceCharge;
	}

	private static boolean notSummer(Date date) {
		return date.before(SUMMER_START) || date.after(SUMMER_END);
	}
}
