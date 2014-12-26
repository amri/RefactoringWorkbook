package refactoring.conditional;

public class ReplaceNestedConditionalWithGuardClauses {
	private boolean _isDead;
	private boolean _isSeparated;
	private boolean _isRetired;

	double getPayAmount()
	{
		double result;
		if(_isDead) result = deadAmount();
		else {
			if (_isSeparated) result = separatedAmount();
			else {
				if (_isRetired) result = retiredAmount();
				else result = normalPayAmount();
			}
		}
		return result;
	}

	private double retiredAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double normalPayAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double separatedAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double deadAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
