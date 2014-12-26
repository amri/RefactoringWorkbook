package refactoring.conditional;

public class ReplaceConditionalWithPolymorphism {
	private static final int EUROPEAN = 0;
	private static final int AFRICAN = 1;
	private static final int NORWEGIAN_GLUE = 2;
	private int _type;
	private int _numberOfCoconuts;
	private Object _voltage;
	private boolean _isNailed;

	double getSpeed()
	{
		switch(_type) {
			case EUROPEAN:
				return getBaseSpeed();
			case AFRICAN:
				return getBaseSpeed() - getLoadFactor() * _numberOfCoconuts;
			case NORWEGIAN_GLUE:
				return (_isNailed) ? 0 : getBaseSpeed(_voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private int getBaseSpeed(Object _voltage2) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getLoadFactor() {
		// TODO Auto-generated method stub
		return 0;
	}

	private double getBaseSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class Employee {
	private int _monthlySalary;
	private int _commision;
	private int _bonus;
	private EmployeeType _type;

	int payAmount() {
		return _type.payAmount(this);
	}

	private int getType() {
		return 0;
	}

	public int getMonthlySalary() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getCommision() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getBonus() {
		// TODO Auto-generated method stub
		return 0;
	}
}

abstract class EmployeeType {

	public static final int MANAGER = 2;
	public static final int SALESMAN = 0;
	public static final int ENGINEER = 1;
	
	abstract int getTypeCode();
	
	abstract int payAmount(Employee emp);
	
}

class Engineer extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.ENGINEER;
	}
	
	int payAmount(Employee emp)
	{
		return emp.getMonthlySalary();
	}
}

class Salesman extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.SALESMAN;
	}
	
	int payAmount(Employee emp)
	{
		return emp.getMonthlySalary() + emp.getCommision();
	}
	
}

class Manager extends EmployeeType {

	@Override
	int getTypeCode() {
		return EmployeeType.MANAGER;
	}
	
	int payAmount(Employee emp)
	{
		return emp.getMonthlySalary() + emp.getBonus();
	}
	
}
