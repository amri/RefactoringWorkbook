package refactoring.conditional;

public class ReplaceNestedConditionalWithGuardClauses {
	private static final double ADJ_FACTOR = 0;
	private boolean _isDead;
	private boolean _isSeparated;
	private boolean _isRetired;
	private double _capital;
	private double _intRate;
	private double _duration;
	private double _income;

	double getPayAmount()
	{
		double result;
		if(_isDead) return deadAmount();
		if (_isSeparated) return separatedAmount();
		if (_isRetired) return retiredAmount();

		return normalPayAmount();
	}
	
	double getAdjustedCapital()
	{
		if(_capital <= 0.0) return 0.0;
		if(_intRate <= 0.0 || _duration <= 0.0) return 0.0;
		return (_income / _duration) * ADJ_FACTOR;
		
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
