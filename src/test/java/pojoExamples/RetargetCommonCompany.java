package pojoExamples;

public class RetargetCommonCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee mahmoud = new Employee();
		mahmoud.id = 10;
		mahmoud.depid= 100;
		mahmoud.address = "amman";
		mahmoud.gender = "male";
		mahmoud.mobileNumber="123";
		
		Employee sameer = new Employee();
		sameer.id = 11;
		sameer.depid= 200;
		sameer.address = "amman";
		sameer.gender = "male";
		sameer.mobileNumber="456";
		
		System.out.println(mahmoud.id);
		System.out.println(sameer.id);
		
	}

}
