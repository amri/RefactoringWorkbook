package refactoring.conditional;

public class IntroduceNullObject {


	public Plan getPlan()
	{
		Plan plan;
		Customer customer = null;
		
		
		
		if(customer == null) plan = BillingPlan.basic();
		else plan = customer.getPlan();
		
		return plan;
	}
	
	public class Customer {
		
		public Plan getPlan() {
			// TODO Auto-generated method stub
			return null;
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
