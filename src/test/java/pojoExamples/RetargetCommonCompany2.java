package pojoExamples;

public class RetargetCommonCompany2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 mahmoud = new Employee2();
		mahmoud.setId(10);
		mahmoud.setDepid(100);
		mahmoud.setAddress("amman");
		mahmoud.setGender("male");
		mahmoud.setMobileNumber("123");
		
		Employee2 sameer = new Employee2 ();
		sameer.setId(11);;
		sameer.setDepid(200);
		sameer.setAddress("amman");
		sameer.setGender("male");
		sameer.setMobileNumber("456");
		
		System.out.println(mahmoud.getId());
		System.out.println(sameer.getId());
		
	}

}
