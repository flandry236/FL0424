package FL0424;

import static org.junit.Assert.assertNotNull;

import java.text.SimpleDateFormat;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class RentalAgreementTest2 {
	
	SimpleDateFormat formatter = new SimpleDateFormat("MM/DD/YY", Locale.ENGLISH );
	String date = "7/2/20";

	
	@Test
	void test() {
		
		try {
			RentalAgreement ra = new Checkout().checkout("LADW",formatter.parse(date),3,10);
			assertNotNull(ra);
			ra.printRA();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}
