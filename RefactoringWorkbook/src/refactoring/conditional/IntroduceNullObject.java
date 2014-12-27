package refactoring.conditional;

public class IntroduceNullObject {


	public Plan getPlan()
	{
		Plan plan;
		Customer customer = null;
		
		
		
		if(customer.isNull()) plan = BillingPlan.basic();
		else plan = customer.getPlan();
		
		return plan;
	}
	
	public class Customer {
		
		public Plan getPlan() {
			return new Plan();
		}
		
		protected Customer() {}
		
		public boolean isNull()
		{
			return false;
		}
	}
	
	public class NullCustomer extends Customer {
		public boolean isNull()
		{
			return true;
		}
	}
	
	public static class BillingPlan {
		
		public static Plan basic() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
	public class Plan {
		
	}
}
