package refactoring.conditional;

public class ReplaceNestedConditionalWithGuardClauses {
	private boolean _isDead;
	private boolean _isSeparated;
	private boolean _isRetired;

	double getPayAmount()
	{
		double result;
		if(_isDead) return deadAmount();
		if (_isSeparated) return separatedAmount();
		if (_isRetired) return retiredAmount();

		return normalPayAmount();
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
