package refactoring.simpler_method_calls;

public class SeparateQueryFromModifier {
	void sendAlert(String[] people)
	{
		if(!foundPeople(people).equals("")) {
			sendAlert();
		}
	}

	String foundPeople(String[] people)
	{
		for(int i =0;i<people.length;i++) {
			
			if(people[i].equals("Don")) {
				sendAlert();
				return "Don";
			}
			if(people[i].equals("John")) {
				sendAlert();
				return "John";
			}
		}
		return "";
	}
	
	private void sendAlert() {
		// TODO Auto-generated method stub
		
	}
	
	void checkSecurity(String[] people) {
		sendAlert(people);
//		String found = foundPeople(people);
		someLaterCode(found);
	}

	private void someLaterCode(String found) {
		// TODO Auto-generated method stub
		
	}
}
